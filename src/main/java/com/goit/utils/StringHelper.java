package com.goit.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shved on 02.02.16.
 */
public class StringHelper {

    /**
     * Checks 2 words if they are anagrams.
     * @param s1 - first word
     * @param s2 - second word
     * @return {@code Boolean} true if they are anagrams, false otherwise
     */
    public static boolean isAnagram(String s1, String s2) {
        if (!isEmpty(s1) && !isEmpty(s2)) {
            if (s1.length() != s2.length()) {
                return false;
            }
            if (s1.compareToIgnoreCase(s2) == 0) {
                return true;
            }
            return checkAnagram(s1, s2);
        }
        return false;
    }

    /**
     * Gets first anagram in list
     * @param words - List of words to check on anagrams
     * @param str - checking word
     * @return {@code String} anagram word
     */
    public static String getAnagram(List<String> words, String str) {
        if (!isEmpty(words) && !isEmpty(str)) {
            return words.stream().filter(s -> isAnagram(str, s)).findFirst().orElse(null);
        }
        return null;
    }

    /**
     * Get anagram words from List of words
     * @param words - list of words
     * @return {@code List<String>} anagrams pairs List, splitted with ' - '
     */
    public static List<String> getAnagramPairsList(List<String> words) {
        if (!isEmpty(words)) {
            List<String> results = new ArrayList<>(words.size());
            for (int i =0; i < words.size() - 1; ++i) {
                for (int j = i+1; j < words.size(); ++j) {
                    if (isAnagram(words.get(i), words.get(j))) {
                        results.add(words.get(i) + " - " + words.get(j));
                    }
                }
            }
            return results;
        }
        return Collections.emptyList();
    }

    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static <T> boolean isEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }

    private static boolean checkAnagram(String s1, String s2) {
        char[] word1 = s1.toLowerCase().toCharArray();
        char[] word2 = s2.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}

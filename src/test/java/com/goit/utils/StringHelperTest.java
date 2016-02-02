package com.goit.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.goit.utils.StringHelper.*;
import static org.junit.Assert.*;

/**
 * Created by home1 on 02.02.16.
 */
public class StringHelperTest {

    private static final String TEST_WORD1 = "wen";
    private static final String TEST_WORD2 = "wne";
    private static final String WRONG_TEST_WORD1 = "123ASDAwen";
    private static final String WRONG_TEST_WORD2 = "wen   ";

    private List<String> words;

    @Before
    public void setUp() throws Exception {
        words = Arrays.asList("done", "new", "node", "low", "wow", "awe", "wae");
    }

    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(isAnagram(TEST_WORD1, TEST_WORD2));
        assertFalse(isAnagram(TEST_WORD1, WRONG_TEST_WORD1));
        assertFalse(isAnagram(TEST_WORD1, WRONG_TEST_WORD2));
    }

    @Test
    public void shouldReturnFalseOnNullStrings() {
        assertFalse(isAnagram(null, TEST_WORD2));
        assertFalse(isAnagram(TEST_WORD1, null));
        assertFalse(isAnagram(null, null));
    }

    @Test
    public void shouldReturnFalseOnEmptyStrings() {
        assertFalse(isAnagram(TEST_WORD1, ""));
        assertFalse(isAnagram("", TEST_WORD2));
        assertFalse(isAnagram("", ""));
        assertFalse(isAnagram("", "        "));
    }

    @Test
    public void testGetAnagram() throws Exception {

    }

    @Test
    public void testGetAnagramPairsList() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testIsEmpty1() throws Exception {

    }
}
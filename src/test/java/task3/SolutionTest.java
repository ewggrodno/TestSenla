package task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome_true() {

        assertTrue(Solution.isPalindrome("abccba"));

    }

    @Test
    public void isPalindrome_false() {

        assertFalse(Solution.isPalindrome("abcabc"));

    }
}
package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isIntegerNumber() {
        assertTrue(Solution.isIntegerNumber("123"));

        assertFalse(Solution.isIntegerNumber("123abc"));
    }

    @Test
    public void isEvenNumber_even() {
        String expected = "четное";

        String actual = Solution.isEvenNumber("2");

        assertEquals(expected, actual);
    }

    @Test
    public void isEvenNumber_notEven() {
        String expected = "не четное";

        String actual = Solution.isEvenNumber("3");

        assertEquals(expected, actual);
    }

    @Test
    public void isPrimeNumber_notCompoundAndNotSimple() {
        String expected = "не составное и не простое";

        String actual = Solution.isPrimeNumber("1");

        assertEquals(expected, actual);
    }

    @Test
    public void isPrimeNumber_compound() {
        String expected = "составное";

        String actual = Solution.isPrimeNumber("4");

        assertEquals(expected, actual);
    }

    @Test
    public void isPrimeNumber_simple() {
        String expected = "простое";

        String actual = Solution.isPrimeNumber("5");

        assertEquals(expected, actual);
    }
}
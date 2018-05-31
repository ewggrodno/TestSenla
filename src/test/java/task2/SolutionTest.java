package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sum() {
        int expected = 4;

        int actual = Solution.sum(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void diff() {
        int expected = 2;

        int actual = Solution.diff(4, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void gcd() {
        int expected = 8;

        int actual = Solution.gcd(72, 128);

        assertEquals(expected, actual);
    }

    @Test
    public void lcm() {
        int expected = 36;

        int actual = Solution.lcm(9, 12);

        assertEquals(expected, actual);
    }
}
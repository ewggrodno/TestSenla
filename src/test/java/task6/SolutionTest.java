package task6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isRightTriangle_true() {
        assertTrue(Solution.isRightTriangle(3, 4, 5));
        assertTrue(Solution.isRightTriangle(4, 5, 3));
        assertTrue(Solution.isRightTriangle(5, 3, 4));
    }

    @Test
    public void isRightTriangle_false() {
        assertFalse(Solution.isRightTriangle(2, 4, 5));
        assertFalse(Solution.isRightTriangle(4, 5, 2));
        assertFalse(Solution.isRightTriangle(5, 2, 4));
    }
}
package task7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getRandomArray() {
        int[] expected = Solution.getRandomArray(10);

        for (int i = 0; i < 100; i++){

            int[] actual = Solution.getRandomArray(10);

            assertNotEquals(expected, actual);

            expected = actual;
        }
    }

    @Test
    public void getArraySort() {
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] temp = new int[]{5, 1, 4, 2, 3};
        int[] actual = Solution.getArraySort(temp);

        assertArrayEquals(expected, actual);
    }
}
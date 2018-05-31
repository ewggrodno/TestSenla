package task4;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getAllWord() {
        String[] expected = new String[]{"word", "Word", "word"};

        String[] actual = Solution.getAllWord("word Word, word");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getCountWord() {
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("word", 3);
        expected.put("Word", 2);
        expected.put("test", 1);

        String[] temp = Solution.getAllWord("word Word, word, Word test, word");
        Map<String, Integer> actual = Solution.getCountWord(temp);

        assertEquals(expected, actual);
    }

}
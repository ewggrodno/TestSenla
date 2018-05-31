package task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolurionTest {

    @Test
    public void getCountWord() {
        int expected = 5;

        String temp = "word Word, word, Word test, word";
        int actual = Solurion.getCountWord(temp, "word");

        assertEquals(expected, actual);
    }
}
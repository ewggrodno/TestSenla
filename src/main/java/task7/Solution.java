package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            int[] randomNumber = getRandomArray(n);
            int[] arraySort = getArraySort(randomNumber);

            printResult(arraySort[0], arraySort[arraySort.length - 1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int[] getRandomArray(int n) {
        int[] arrayInteger = new int[n];
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = (int) (10 + Math.random() * 90);
        }
        return arrayInteger;
    }

    static int[] getArraySort(int[] arrInt) {
        int[] temp = arrInt;
        Arrays.sort(temp);
        return temp;
    }

    private static void printResult(int min, int max) {
        System.out.printf("min number: %d - max number: %d", min, max);
    }
}

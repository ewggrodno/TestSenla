package task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] arr = new Integer[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            numberGenerator(arr).forEach(System.out::println);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка: вы ввели не целое число");
        }
    }

    static Set<String> numberGenerator(Integer[] array) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) continue;
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    String result = String.format("%d%d%d", array[i], array[j], array[k]);
                    strings.add(result);
                }
            }

        }
        return strings;
    }
}

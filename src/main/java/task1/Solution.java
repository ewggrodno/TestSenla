package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            if (!isIntegerNumber(text)) {
                System.out.println("Ошибка: Введенное число не целое или введенное не является числом");
            } else {
                System.out.printf("%s: %s %s число\n", text, isEvenNumber(text), isPrimeNumber(text));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isIntegerNumber(String num) {
        return num.matches("\\d+");
    }

    static String isEvenNumber(String num) {
        if (Integer.parseInt(num) % 2 == 0) {
            return "четное";
        } else return "не четное";
    }

    static String isPrimeNumber(String num) {
        int number = Integer.parseInt(num);
        if (number == 1) {
            return "не составное и не простое";
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return "составное";
            }
        }
        return "простое";
    }
}

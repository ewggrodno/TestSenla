package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите два целых числа");
            int firstNumber = Integer.parseInt(reader.readLine());
            int secondNumber = Integer.parseInt(reader.readLine());
            System.out.printf("Сумма чисел: %d\n", sum(firstNumber, secondNumber));
            System.out.printf("Разность чисел: %d\n", diff(firstNumber, secondNumber));
            System.out.printf("НОК чисел: %d\n", lcm(firstNumber, secondNumber));
            System.out.printf("НОД чисел: %d\n", gcd(firstNumber, secondNumber));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка ввода: вы ввелине не целое число");
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int diff(int a, int b) {
        return a - b;
    }

    static int gcd(int a, int b) {
        int temp = a % b;
        a = b;
        b = temp;
        if (temp > 0) {
            return gcd(a, b);
        } else {
            return a;
        }
    }

    static int lcm(int a, int b) {
        return (a * b / gcd(a, b));
    }

}

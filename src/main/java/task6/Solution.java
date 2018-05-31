package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());
            double c = Double.parseDouble(reader.readLine());
            if (isRightTriangle(a, b, c)) {
                System.out.println("Это прямоугольный треугольник");
            } else {
                System.out.println("Это не прямоугольный треугольник");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: не верные параметры ввода");
        }
    }

    static boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}

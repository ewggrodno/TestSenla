package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Integer.parseInt(reader.readLine());
            long count = 0;
            for (long i = 2; i <= n; i += 2) {
                count += i;
                System.out.println(i + " " + count);
            }
            System.out.println("сумма: " + count);

        } catch (IOException e) {
            System.out.println("Ошибка: введенное не число");
        }
    }
}

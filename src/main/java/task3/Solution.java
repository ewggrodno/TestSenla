package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = reader.readLine();
            if (isPalindrome(word)) {
                System.out.printf("\"%s\" - это слово палиндром", word);
            } else {
                System.out.printf("\"%s\" - это слово не палиндром", word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static boolean isPalindrome(String string) {
        if (string.length() <= 1) return false;
        String reverse = new StringBuilder(string).reverse().toString();
        return string.equals(reverse);
    }
}

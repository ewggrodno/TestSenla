package task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public Set<BigInteger> integerSet = new HashSet<>();

    public static void main(String[] args) {
        Solution solution = new Solution();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();

            if (string != null && isNumbers(string) && string.length() <= 100) {
                solution.getAllPalindromes(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void getAllPalindromes(String string) {
        for (int i = 0; i < string.length(); i++) {

            String sub = string.substring(i, string.length());

            if (sub.length() > 1) {
                for (int j = sub.length(); j > 0; j--) {
                    if (isPalindrome(sub.substring(0, j))) {
                        integerSet.add(new BigInteger(sub.substring(0, j)));
                    }
                }
            }
        }
    }

    static boolean isPalindrome(String string) {
        if (string.length() <= 1) return false;
        return string.equals(reverse(string));
    }

    static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    static boolean isNumbers(String string) {
        return string.matches("\\d+");
    }
}

package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solurion {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            String word = reader.readLine();
            print(word, getCountWord(text, word));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int getCountWord(String text, String word) {
        int result = 0;
        Pattern pattern = Pattern.compile("\\b(" + word.toLowerCase() + ")\\b");
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            result++;
        }
        return result;
    }

    private static void print(String word, int count) {
        System.out.printf("Слово \"%s\" в тексте встречается %d раз(а)\n", word, count);
    }
}

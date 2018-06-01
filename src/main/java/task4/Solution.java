package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            Map<String, Integer> countAllWord = getCountWord(getAllWord(text));
            printResultMap(countAllWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String[] getAllWord(String text) {
        String string = text.replace(",", "");
        return string.split(" ");
    }

    static Map<String, Integer> getCountWord(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    private static void printResultMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(String.format("%s : %d", key, value)));
    }
}

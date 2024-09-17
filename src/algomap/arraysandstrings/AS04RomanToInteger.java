package algomap.arraysandstrings;

import java.util.Map;

public class AS04RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanSymbols = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int result = 0;

        // Largest to smallest --> add them up
        // smaller before larger --> subtract smaller
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() &&
                    romanSymbols.get(s.charAt(i)) < romanSymbols.get(s.charAt(i+1))) {
                result -= romanSymbols.get(s.charAt(i));
            } else {
                result += romanSymbols.get(s.charAt(i));
            }
        }

        return result;
    }
}

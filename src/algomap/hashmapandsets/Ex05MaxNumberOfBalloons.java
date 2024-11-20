package algomap.hashmapandsets;

import java.util.HashMap;

// https://leetcode.com/problems/maximum-number-of-balloons/
public class Ex05MaxNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }

    // TC = O(n) where n=len(text);
    // SC = O(1)
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>(5);
        String balloon = "balloon";

        for (char ch : text.toCharArray()) {
            if (balloon.indexOf(ch) != -1) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        if (!map.containsKey('b') ||
                !map.containsKey('a') ||
                !map.containsKey('l') ||
                !map.containsKey('o') ||
                !map.containsKey('n')
        ) {
            return 0;
        }

        return Math.min(Math.min(map.get('b'), map.get('a')),
                Math.min(map.get('l') / 2,
                        Math.min(map.get('o') / 2, map.get('n'))));
    }
}

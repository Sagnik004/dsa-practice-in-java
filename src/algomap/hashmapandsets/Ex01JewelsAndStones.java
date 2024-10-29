package algomap.hashmapandsets;

import java.util.HashSet;

// https://leetcode.com/problems/jewels-and-stones/
public class Ex01JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    // TC = O(j+s), SC = O(j)
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();

        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }

        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }

        return count;
    }
}

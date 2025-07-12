package leetcode.leetcode75.A01ArrayString;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description
public class AS03KidsWithGreatestNumOfCandies {

    // TC = O(n) where n=length of candies array, SC = O(n) for the result list
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int el : candies) {
            if (el > max) {
                max = el;
            }
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AS03KidsWithGreatestNumOfCandies thisClass = new AS03KidsWithGreatestNumOfCandies();
        System.out.println(thisClass.kidsWithCandies(new int[] {2,3,5,1,3}, 3));
        System.out.println(thisClass.kidsWithCandies(new int[] {4,2,1,1,2}, 1));
        System.out.println(thisClass.kidsWithCandies(new int[] {12,1,12}, 10));
    }
}

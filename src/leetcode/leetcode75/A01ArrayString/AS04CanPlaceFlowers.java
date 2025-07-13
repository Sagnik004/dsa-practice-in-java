package leetcode.leetcode75.A01ArrayString;

// https://leetcode.com/problems/can-place-flowers/description
public class AS04CanPlaceFlowers {

    // TC = O(n) where n = flowerbed length; SC = O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers to plant then return true
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            // Only if current plot is empty, then proceed
            if (flowerbed[i] == 0) {
                boolean isPrevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isNextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // Only if both adjacent positions are empty, then proceed
                if (isPrevEmpty && isNextEmpty) {
                    flowerbed[i] = 1;
                    n = n - 1;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        AS04CanPlaceFlowers thisClass = new AS04CanPlaceFlowers();
        System.out.println(thisClass.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
        System.out.println(thisClass.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
    }
}

package algomap.twopointers;

// https://leetcode.com/problems/container-with-most-water/description/
public class Ex05ContainerWithMostWater {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(input));

        input = new int[] {1,1};
        System.out.println(maxArea(input));
    }

    // TC = O(n), SC = O(1)
    // https://youtu.be/UuiTKBwPgAo
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            res = Math.max(res, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}

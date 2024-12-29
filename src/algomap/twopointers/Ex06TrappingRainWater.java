package algomap.twopointers;

// https://leetcode.com/problems/trapping-rain-water/description/
public class Ex06TrappingRainWater {
    public static void main(String[] args) {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(input));

        input = new int[] {4,2,0,3,2,5};
        System.out.println(trap(input));
    }

    // TC = O(n), SC = O(1)
    // https://youtu.be/m18Hntz4go8
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int result = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    result += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    result += rightMax - height[right];
                }
                right--;
            }
        }

        return result;
    }
}

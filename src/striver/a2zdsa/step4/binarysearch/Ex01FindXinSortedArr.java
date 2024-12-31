package striver.a2zdsa.step4.binarysearch;

// https://leetcode.com/problems/binary-search/description/
public class Ex01FindXinSortedArr {
    public static void main(String[] args) {
        int[] input = {-1,0,3,5,9,12};
        System.out.println(search(input, 9));

        input = new int[] {-1,0,3,5,9,12};
        System.out.println(search(input, 2));
    }

    // TC = O(log N), SC = O(1)
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}

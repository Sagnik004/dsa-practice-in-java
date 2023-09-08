package striver.a2zdsa.step3.arrays.easy;

import java.util.Arrays;

// https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,7,5};
        int[] arr2 = {1,2,4,7,7,5};
        int[] arr3 = {1};

        bruteForceApproach(arr1);
        betterApproach(arr1);
        optimalApproach(arr1);

        System.out.println("-".repeat(25));
        betterApproach(arr2);
        optimalApproach(arr2);

        System.out.println("-".repeat(25));
        betterApproach(arr3);
        optimalApproach(arr3);
    }

    /*
        This approach doesn't work if duplicates are present.
        TC = O(N * logN), SC = O(1)
    */
    private static void bruteForceApproach(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            System.out.println("[-1, -1]");
            return;
        }

        Arrays.sort(arr);
        int secondSmallest = arr[1];
        int secondLargest = arr[len - 2]; // -1 for 0 index, and -1 for 2nd position
        System.out.println("[" + secondSmallest + ", " + secondLargest + "]");
    }

    /*
        First run a loop and find the smallest and largest elements. Then,
        run another loop to find elements which is just greater than smallest
        and just smaller than the largest element.

        TC = O(N) but runs 2 times, SC = O(1)
    */
    private static void betterApproach(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            System.out.println("[-1, -1]");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the smallest and largest elements
        for (int el : arr) {
            smallest = Math.min(smallest, el);
            largest = Math.max(largest, el);
        }

        // Find second_smallest and second_largest elements
        for (int el : arr) {
            if (el < secondSmallest && el != smallest) {
                secondSmallest = el;
            }
            if (el > secondLargest && el != largest) {
                secondLargest = el;
            }
        }

        System.out.println("[" + secondSmallest + ", " + secondLargest + "]");
    }

    /*
        Approach: Declare 4 variables - smallest, secondSmallest set to Integer.MAX_VALUE,
        and largest, secondLargest set to Integer.MIN_VALUE. Now run 1 iterating through the
        array elements. For each element perform the below steps to get the secondSmallest
        and secondLargest elements.

        secondSmallest logic:
        - if the current element is smaller than the smallest element, then assign the smallest
        element to secondSmallest and smallest to current element
        - else if the current element is smaller than the secondSmallest element and is not
        equal to the smallest element, then assign secondSmallest element with current value.

        secondLargest logic:
        - if the current element is larger than the largest element, then assign the largest
        element to secondLargest and largest to current element
        - else if the current element is just larger than the secondLargest element and is not
        equal to the largest element, then assign secondLargest element with current value.

        TC = O(N) with single pass, SC = O(1)
    */
    private static void optimalApproach(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            System.out.println("[-1, -1]");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int el : arr) {
            // Logic for smallest and secondSmallest
            if (el < smallest) {
                secondSmallest = smallest;
                smallest = el;
            } else if (el < secondSmallest && el != smallest) {
                secondSmallest = el;
            }

            // Logic for largest and secondLargest
            if (el > largest) {
                secondLargest = largest;
                largest = el;
            } else if (el > secondLargest && el != largest) {
                secondLargest = el;
            }
        }

        System.out.println("[" + secondSmallest + ", " + secondLargest + "]");
    }
}


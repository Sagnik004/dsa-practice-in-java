package educative;

public class A07FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {9,2,3,6};
        System.out.println(findSecondMaximum(arr));

        arr = new int[] {4,2,1,5,0};
        System.out.println(findSecondMaximum(arr));
    }

    public static int findSecondMaximum(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int el : arr) {
            if (el > largest) {
                secondLargest = largest;
                largest = el;
            } else if (el > secondLargest && el != largest) {
                secondLargest = el;
            }
        }

        return secondLargest;
    }
}

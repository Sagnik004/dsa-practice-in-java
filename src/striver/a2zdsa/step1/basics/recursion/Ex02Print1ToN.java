package striver.a2zdsa.step1.basics.recursion;

// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class Ex02Print1ToN {
    public static void main(String[] args) {
        printNos(5);
    }

    public static void printNos(int n) {
        if (n <= 0) return;

        printNos(n-1);
        System.out.println(n);
    }
}

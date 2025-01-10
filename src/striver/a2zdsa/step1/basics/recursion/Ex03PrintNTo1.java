package striver.a2zdsa.step1.basics.recursion;

// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
public class Ex03PrintNTo1 {

    public static void main(String[] args) {
        printFromNToOne(10);
    }

    private static void printFromNToOne(int n) {
        if (n <= 0) return;

        System.out.print(n + " ");
        printFromNToOne(n - 1);
    }
}

package striver.a2zdsa.step1.basics.recursion;

// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
public class Ex01PrintNameNTimes {

    public static void main(String[] args) {
        printName(3);
        printName(-1);
        printName(1);
    }

    private static void printName(int n) {
        if (n <= 0) return;

        System.out.println("Super Mario");
        n--;
        printName(n);
    }
}

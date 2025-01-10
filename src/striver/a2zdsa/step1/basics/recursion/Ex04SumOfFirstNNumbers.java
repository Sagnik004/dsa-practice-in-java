package striver.a2zdsa.step1.basics.recursion;

// https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
public class Ex04SumOfFirstNNumbers {

    public static void main(String[] args) {
        System.out.println(recursionFn(5));
        System.out.println(directFormulaFn(5));

        System.out.println(recursionFn(0));
        System.out.println(directFormulaFn(0));
    }

    private static int recursionFn(int n) {
        if (n <= 0) return 0;

        return n + recursionFn(n - 1);
    }

    private static int directFormulaFn(int n) {
        return n * (n + 1) / 2;
    }
}

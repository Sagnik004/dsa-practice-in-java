package striver.a2zdsa.step1.basics.recursion;

// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
public class Ex04SumOfFirstNTerms {

    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
        System.out.println(sumOfSeries(7));
    }

    private static int sumOfSeries(int n) {
        if (n <= 0) return 0;

        return (int) Math.pow(n, 3) + sumOfSeries(n - 1);
    }
}

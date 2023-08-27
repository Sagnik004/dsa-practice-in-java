package striver.a2zdsa.step1.basics;

public class DivisorsOfGivenNumber {
    public static void main(String[] args) {
        approach1(36);
        approach1(97);

        approach2(36);
        approach2(97);
    }

    /*
        Brute force approach.
        TC = O(n), SC = O(1)
    */
    static void approach1(int num) {
        for (int i = 1; i <= (num/2); i++) {
            if (num%i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
        System.out.println();
    }

    /*
        Optimal approach.
        TC = O(sqrt(n)), SC = O(1)
    */
    static void approach2(int num) {
        int sqrtOfNum = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrtOfNum; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                /* Quotient is also a divisor when remainder = 0. */
                if ((num / i) != i) { /* For perfect squares print only once (36=6*6) */
                    System.out.print((num/i) + " ");
                }
            }
        }
        System.out.println();
    }
}

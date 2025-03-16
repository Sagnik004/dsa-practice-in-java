package practicetopics.lambdastreams;

import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex04SumOfOddAndEvenNums {

    public static void main(String[] args) {
        List<Integer> numsList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);

        // Sum of all even nums
        int sumOfEvens = numsList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of the even numbers: " + sumOfEvens);

        // Sum of all odd nums
        int sumOfOdds = numsList.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of the odd numbers: " + sumOfOdds);
    }
}

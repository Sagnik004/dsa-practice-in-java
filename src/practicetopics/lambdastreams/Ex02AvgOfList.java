package practicetopics.lambdastreams;

import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex02AvgOfList {

    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 3, 6, 8, 10, 18, 36);

        System.out.println("Average is: " + approach1(numList));
        System.out.println("Average is: " + approach2(numList));
    }

    private static double approach1(List<Integer> nums) {
        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (double) sum / nums.size();
    }

    private static double approach2(List<Integer> nums) {
        return nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}

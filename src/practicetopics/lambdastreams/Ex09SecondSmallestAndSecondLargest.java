package practicetopics.lambdastreams;

import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex09SecondSmallestAndSecondLargest {

    public static void main(String[] args) {
        List<Integer> numsList = List.of(1, 17, 54, 14, 14, 33, 45, -11);

        Integer secondMinValue = numsList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second min value is: " + secondMinValue);

        Integer secondMaxValue = numsList.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second max value is: " + secondMaxValue);
    }
}

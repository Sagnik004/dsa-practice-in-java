package practicetopics.lambdastreams;

import java.util.List;
import java.util.Optional;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex08MaxAndMinValues {

    public static void main(String[] args) {
        List<Integer> numsList = List.of(7, 5, 78, 2, 9, 15, 8, 0, 11, 19, -14, 22, 1);

        Optional<Integer> maxValue = numsList.stream().max(Integer::compare);
        maxValue.ifPresent(value -> System.out.println("Max value is: " + value));

        Integer minValue = numsList.stream().min(Integer::compare).orElse(null);
        System.out.println("Min value is: " + minValue);
    }
}

package practicetopics.lambdastreams;

import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex05RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);

        List<Integer> uniqueNums = nums.stream().distinct().toList();
        System.out.println(uniqueNums);
    }
}

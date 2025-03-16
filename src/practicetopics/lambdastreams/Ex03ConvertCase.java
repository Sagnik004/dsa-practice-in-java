package practicetopics.lambdastreams;

import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex03ConvertCase {

    public static void main(String[] args) {
        List<String> fruitsList = List.of(
                "aPPle", "KiWi", "StrawBERRY", "mango", "orange", "BANANa");

        System.out.println(convertToLowerCase(fruitsList));
        System.out.println(convertToUpperCase(fruitsList));
    }

    private static List<String> convertToLowerCase(List<String> fruits) {
        return fruits.stream()
                .map(String::toLowerCase)
                .toList();
    }

    private static List<String> convertToUpperCase(List<String> fruits) {
        return fruits.stream()
                .map(String::toUpperCase)
                .toList();
    }
}

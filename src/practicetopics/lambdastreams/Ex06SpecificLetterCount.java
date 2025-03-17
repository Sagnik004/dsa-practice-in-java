package practicetopics.lambdastreams;

import java.util.Arrays;
import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex06SpecificLetterCount {

    public static void main(String[] args) {
        List<String> names = List.of("Barbara", "Jack", "Nemo", "Bobby", "Ken", "Natasha", "Bhaskar");

        long countOfNamesStartingWithB = names.stream()
                .filter(name -> name.toLowerCase().startsWith("b"))
                .count();

        System.out.println("Count of names starting with 'B': " + countOfNamesStartingWithB);

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startingLetter = 'B';
        long count = colors.stream()
                .filter(color -> color.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Count of colors starting with '" + startingLetter + "' is: " + count);
    }
}

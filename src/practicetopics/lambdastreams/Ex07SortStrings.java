package practicetopics.lambdastreams;

import java.util.Comparator;
import java.util.List;

// https://www.w3resource.com/java-exercises/stream/index.php
public class Ex07SortStrings {

    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Green", "Blue", "Pink", "Brown");

        List<String> sortedAsc = colors.stream()
                .sorted()
                .toList();
        System.out.println(sortedAsc);

        List<String> sortedDsc = colors.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedDsc);
    }
}

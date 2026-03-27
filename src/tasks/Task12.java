package tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        //hər uzunluğun sayını tap

        List<String> words = List.of("java", "api", "code", "spring");

       Map<Integer,Long>  wordsLength =words.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
                ));
        System.out.println(wordsLength);

    }
}

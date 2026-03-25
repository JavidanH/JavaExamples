package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "code", "spring", "api", "rest");

        Map<Integer,List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));

        Map<Integer, Long> count = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(grouped);
        System.out.println(count);
    }


}

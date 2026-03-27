package tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {



        //elementləri uzunluğa görə group et

        List<String> words = List.of("java", "api", "code", "spring");

        Map<Integer,List<String>> maxLenght = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(maxLenght);

    }
}

package day3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {

        Map<String,Integer> map = Map.of("A",1,"B",2,"C",1,"D",2);
            //Eyni value-ları group et

        Map<Integer, List<String>> grouped = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList())
                ));

        System.out.println(grouped);
    }
}

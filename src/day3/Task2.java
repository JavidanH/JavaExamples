package day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        //Map-i value-ya görə sort et

        Map<String,Integer> map = Map.of(  "A", 10,
                "B", 25,
                "C", 15);


        Map<String, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(result);

    }
}

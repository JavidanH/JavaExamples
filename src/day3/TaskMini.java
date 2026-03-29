package day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskMini {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("Ali", 28, "Veli", 25);

        Map<String, Integer> result =  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(result);
    }
}

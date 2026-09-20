package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        String input = "developer";

        // String-i char-lara bölüb hər hərfin sayını tapırıq
        Map<Character, Long> charCountMap = input.chars() // IntStream qaytarır (ASCII kodlar)
                .mapToObj(c -> (char) c)                       // Stream<Character>-ə çeviririk
                .collect(Collectors.groupingBy(
                        Function.identity(),                      // Hər bir hərfin özü KEY olur (c -> c)
                        Collectors.counting()                     // Hər hərfin sayını hesablayır
                ));

        System.out.println("Hərflərin sayı: " + charCountMap);
        // Nəticə: {d=1, e=3, v=1, l=1, o=1, p=1, r=1}
    }
}

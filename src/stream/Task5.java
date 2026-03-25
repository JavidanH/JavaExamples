package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 7, 2, 9, 10, 4);

        /*
        Cüt ədədləri seç (filter)
        Kvadratını al (map)
        List kimi qaytar (collect)

        BONUS:

        max və min tap
         */

           List<Integer> result = numbers.stream().filter(numbers2 -> numbers2 % 2==0).map(numbers2-> numbers2 * numbers2)
                    .collect(Collectors.toList());

        System.out.println(result);


        int max = numbers.stream().max(Integer::compareTo).orElse(0);

        int min = numbers.stream().min(Integer :: compareTo).orElse(0);

        System.out.println(max);
        System.out.println(min);
    }
}

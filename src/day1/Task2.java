package day1;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(7, 2, 10, 4);

      // Optional<Integer> max = list.stream().max(Integer::max);

    int max = list.stream().max(Integer::compareTo).orElseThrow();


        System.out.println(max);
    }
}

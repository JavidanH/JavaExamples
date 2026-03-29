package day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3);

        //List → Set çevir (duplicate-lər silinsin)

        Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);

        List<Integer> result = list.stream().distinct().toList();
        System.out.println(result);

    }
}

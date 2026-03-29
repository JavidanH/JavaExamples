package day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {


        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(3, 4, 5);

        //2 list-in union-u (birləşməsi)
        Set<Integer> set1 = new LinkedHashSet<>(list1);
        Set<Integer> set2 = new LinkedHashSet<>(list2);

        set1.addAll(set2);

        System.out.println(set1);

    }
}

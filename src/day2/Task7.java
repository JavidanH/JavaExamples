package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task7 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        //2 list-in ortaq elementlərini tap (intersection)

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);

        System.out.println(set1);

        List<Integer> result = new ArrayList<>();

        for (Integer n : list1) {
            if (list2.contains(n)) {
                result.add(n);
            }
        }

        System.out.println(result);
    }
}

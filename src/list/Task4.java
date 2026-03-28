package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5);

            //List-də duplicate elementləri sil

       Set<Integer> set = new LinkedHashSet<>(list);

       List<Integer> result1 = new ArrayList<>(set);

        System.out.println(result1);

      List<Integer> result =  list.stream().distinct().toList();

        System.out.println(result);

    }
}

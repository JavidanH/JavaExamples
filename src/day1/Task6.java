package day1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task6 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,2);

        //List-də duplicate varmı?

        Set<Integer> set = new LinkedHashSet<>(list);

        boolean mug = set.size() < list.size();

        System.out.println(mug);
    }
}

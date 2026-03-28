package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task11 {

    public static void main(String[] args) {

        //List-də duplicate elementləri ayrıca list kimi çıxart

        List<Integer> list = List.of(1,2,2,3,4,4);

        Set<Integer> set = new HashSet<>();

        List<Integer> duplicates = new ArrayList<>();


        for (int n : list){
            if (set.contains(n)) {
                duplicates.add(n);
            } else {
                set.add(n);
            }
        }

        /*
        for (int n : list) {
            if (!seen.add(n)) {
                duplicates.add(n);
            }
            }
         */
        System.out.println(duplicates);
    }
}

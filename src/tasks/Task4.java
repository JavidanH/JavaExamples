package tasks;

import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,2,9,1);
        /*
        ən böyük elementi tap
        Collections istifadə ETMƏ
         */

        int max =  list.stream().max(Integer::compareTo).orElse(0);

        System.out.println(max);

        /*
            int max = list.get(0);

                for (int num : list) {
                if (num > max) {
                max = num;
                }
            }
         */

    }
}

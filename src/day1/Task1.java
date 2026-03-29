package day1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //Verilmiş list-də bütün elementlərin cəmini tap

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        int sum = 0;

        /* int sum = list.stream()
                         .reduce(0, Integer::sum); */

        for( Integer n : list){
           sum += n;
        }

        System.out.println(sum);
    }
}

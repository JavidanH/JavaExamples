package tasks;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        //bütün elementlərin cəmini tap (reduce ilə)

        List<Integer> list = List.of(1, 2, 3, 4);

        int sum = list.stream().reduce(0,Integer::sum);

        System.out.println(sum);
    }
}

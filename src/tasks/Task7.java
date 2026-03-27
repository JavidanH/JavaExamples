package tasks;

import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);

        /*
        yalnız cüt ədədləri saxla
        kvadratlarını al
        listə yığ
         */

        List<Integer> result = list.stream().filter(n -> n % 2 == 0)
                .map(n->n*n)
                .toList();

        System.out.println(result);
    }
}

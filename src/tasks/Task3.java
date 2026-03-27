package tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4);
            /*
            duplicate-ləri sil
            nəticəni çap et
             */

        //set dublicate element saxlamir
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}

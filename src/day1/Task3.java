package day1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

        List<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1 ; i >= 0;i--){
            reversed.add(list.get(i));
        }

        System.out.println(reversed);
    }
}

package day1;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 3, 2, 3, 4, 3, 2);

        //List-də ən çox təkrarlanan elementi tap

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer n : list) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }
}
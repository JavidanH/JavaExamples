package day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 3, 3, 3, 4);

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer number : list){
            map.put(number,
                    map.getOrDefault(number,0) +1);
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

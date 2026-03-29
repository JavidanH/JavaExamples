package day3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        //Map-də key və value yerlərini dəyiş

        Map<String,Integer> map = Map.of("A",1,"B",2,"C",3);

        Map<Integer,String> map2 = new HashMap<>();

            for(Map.Entry<String,Integer> entry : map.entrySet()){
                map2.put(entry.getValue(),entry.getKey());
            }

        System.out.println(map2);
    }
}

package day3;

import java.util.HashMap;
import java.util.Map;

public class Task3Mini {
    public static void main(String[] args) {

        Map<String,Integer> map = Map.of("Ali", 28, "Veli", 25, "Aysel", 30);

        Map<Integer,String> map2 = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            map2.put(entry.getValue(),entry.getKey());
        }

        System.out.println(map2);
    }
}

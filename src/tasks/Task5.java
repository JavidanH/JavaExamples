package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        /*
        String-də hər hərfin neçə dəfə təkrarlandığını tap

            Input: "java"

            j=1
            a=2
            v=1
         */

        String str = "java";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        System.out.println(map);
    }
}

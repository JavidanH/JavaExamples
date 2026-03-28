package list;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
        //String-də hər hərfin neçə dəfə təkrarlandığını tap

        String str = "programming";

        Map<Character,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }

        System.out.println(map);
    }
}

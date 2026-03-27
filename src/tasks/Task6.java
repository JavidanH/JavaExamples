package tasks;

import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        //ən böyük value-ya sahib entry-ni tap

        Map<String, Integer> map = Map.of(
                "A",10,
                "B",25,
                "C",15
        );

        String maxKey = null;
        int maxValue = Integer.MAX_VALUE;

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey + " = " + maxValue);
    }
}

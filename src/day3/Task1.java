package day3;

import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        //Map-də ən böyük value-ya sahib elementi tap

        Map<String,Integer> map = Map.of("A",10,"B",25,"C",15);

        String maxKey = null;

        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue()> maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey + "=" + maxValue);
    }
}

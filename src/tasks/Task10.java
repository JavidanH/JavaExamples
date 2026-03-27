package tasks;

import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        //ən uzun string-i tap

        List<String> words = List.of("java", "springboot", "api");

       String longest= words.stream().reduce((w1,w2) -> w1.length()> w2.length() ? w1:w2)
                .orElse("");

        System.out.println(longest);
    }
}

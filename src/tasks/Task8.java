package tasks;

import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "code", "spring", "api");

        /*
            uzunluğu 4-dən böyük olanları seç
            böyük hərflə qaytar
         */

        List<String> filteredWords = words.stream().filter(w->w.length()>4).map(String::toUpperCase)
                .toList();

        System.out.println(filteredWords);
    }
}

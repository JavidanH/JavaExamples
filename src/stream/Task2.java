package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Veli", "Ayse", "Mehmet", "Ayan");

        /*
            Uzunluğu 4-dən böyük olanları filter et
            Hamısını UPPERCASE et (map)
            List kimi collect et

            ["MEHMET"]
         */

        List<String> result = names.stream().filter(names2 -> names2.length() >4).map(String :: toUpperCase).collect(Collectors.toList());

        System.out.println(result);
    }
}

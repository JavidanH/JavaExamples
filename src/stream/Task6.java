package stream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Muhammad","Cavidan");

        Stream<String> stream = names.stream()
                .filter(name ->{
                    System.out.println("Filter icra olundu " + name);
                    return  name.length()>3;
                })
                .map(name ->{
                    System.out.println("Map icra olundu " + name);
                    return name.toUpperCase(Locale.ROOT);
                });
        System.out.println("Terminal emeliyyatlardan evvel (LAZY");

    //    List<String> result = stream.collect(Collectors.toList());

        System.out.println("Terminal emelliyyatlardan sonra");



    }
}

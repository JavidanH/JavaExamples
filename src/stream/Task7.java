package stream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1,"Cavidan", 25, List.of("050-111-2233", "070-444-5566")),
                new User(2,"Ali", 16, List.of("055-999-8877")), // Yaşı < 18 (filter-dən keçməyəcək)
                new User(3,"Leyla", 22, List.of("051-333-2211"))
        );

        List<String> allPhoneNumbersOfAdults = users.stream()
                .filter(user -> user.getAge()>=18)
                .flatMap(user -> user.getPhoneNumbers().stream())
                .collect(Collectors.toList());


        System.out.println("18-dən böyük istifadəçilərin telefonları:");
        allPhoneNumbersOfAdults.forEach(System.out::println);
    }
}

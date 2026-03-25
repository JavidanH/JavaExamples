package stream;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

            /*
            Cəmini tap (sum)
            Hasilini tap (product)
            String kimi birləşdir: "12345"
             */

        int sum = numbers.stream().reduce(0,Integer ::sum);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        String concat = numbers.stream().map(String :: valueOf)
                .reduce("", (a, b) -> a + b);

        System.out.println(sum);
        System.out.println(product);
        System.out.println(concat);
    }
}

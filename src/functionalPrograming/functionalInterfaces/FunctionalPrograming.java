package functionalPrograming.functionalInterfaces;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalPrograming {
    public static void main(String[] args) {

        // 1. Predicate<String>: String alır, boolean qaytarır
        Predicate<String> isLengthGreaterThanFive = str -> str != null && str.length() > 5;

        System.out.println("1. Predicate nəticəsi:");
        System.out.println("  'Java' uzunluğu > 5? " + isLengthGreaterThanFive.test("Java"));     // false
        System.out.println("  'SpringBoot' uzunluğu > 5? " + isLengthGreaterThanFive.test("SpringBoot")); // true


        // 2. Function<Integer, String>: Integer alır, String qaytarır
        Function<Integer, String> formatPrice = price -> price + " AZN";

        System.out.println("\n2. Function nəticəsi:");
        System.out.println("  Formatted: " + formatPrice.apply(100)); // "100 AZN"


        // 3. Consumer<String>: String alır, heç nə qaytarmır (void)
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        System.out.println("\n3. Consumer nəticəsi:");
        printUpperCase.accept("hello world"); // Konsola yazar: HELLO WORLD


        // 4. Supplier<Double>: Parametr almır, Double qaytarır
        Supplier<Double> randomDoubleSupplier = () -> new Random().nextDouble();

        System.out.println("\n4. Supplier nəticəsi:");
        System.out.println("  Random 1: " + randomDoubleSupplier.get());
        System.out.println("  Random 2: " + randomDoubleSupplier.get());


        // BONUS TASK: Predicate-i metod parametri kimi ötürmək
        System.out.println("\n5. Bonus Task (Filter cüt ədədlər):");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Cüt ədədləri filtr edən Predicate
        filterAndPrint(numbers, num -> num % 2 == 0);
    }

    // Generic metod: List və Predicate qəbul edir
    public static void filterAndPrint(List<Integer> list, Predicate<Integer> condition) {
        for (Integer number : list) {
            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
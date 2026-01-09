package arrayListExamples;

import java.util.ArrayList;

public class ExampleSecond {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Afag");
        names.add("Javidan");
        names.add("Farida");
        names.add("Lala");
        names.add("Bahram");
        names.add("Orxan");
        names.add("Aydan");

        System.out.println("Print names elements: " + names);

        String firstElement = names.get(0);
        System.out.println("Get First element of array: " + firstElement);

        boolean exists = names.contains("Javidan");
        System.out.println(exists);

        for (String n : names){
            System.out.println(n);
        }

        System.out.println("Learn array is empty or not: " + names.isEmpty());

        names.clear(); //ArrayList-i temizlemek
        System.out.println(names);
    }
}

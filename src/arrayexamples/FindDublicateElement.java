package arrayexamples;

import java.util.HashSet;
import java.util.Set;

public class FindDublicateElement {
    public static void main(String[] args) {
        String[] people = {"Afag", "Javidan", "Farida", "Lala",
                "Aydan", "Bahram","Orxan","Lala", "Cavidan"};

        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].equals(people[j])) {
                    System.out.println("Təkrarlanan ad: " + people[i]);
                }
            }
        }
        Set<String> unique = new HashSet<>();

        for ( String newPeople : people){
            if ( !unique.add(newPeople)){
                System.out.println("Tekrarlanan element: " + newPeople);
            }
        }
    }
}

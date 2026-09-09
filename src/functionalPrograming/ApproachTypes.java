package functionalPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApproachTypes {
    public static void main(String[] args) {
            getImperativeApproach();
            getDeclarativeApproach();
    }



    public static void getImperativeApproach(){
            List<Person> persons = List.of(
                    new Person("Cavidan","Haciyev",Gender.MALE),
                    new Person("Behram","Nabiyev",Gender.MALE),
                    new Person("Afag","Tanriverdiyeva",Gender.FEMALE)
            );

            List<Person> filteredPerson = new ArrayList<>();

            for (Person person : persons){
                if (person.getGender().equals(Gender.MALE)){
                    filteredPerson.add(person);
                }
            }

        System.out.println(filteredPerson);
    }

    public static List<Person> getDeclarativeApproach(){

        List<Person> persons = List.of(
                new Person("Cavidan","Haciyev",Gender.MALE),
                new Person("Behram","Nabiyev",Gender.MALE),
                new Person("Afag","Tanriverdiyeva",Gender.FEMALE)
        );

       return persons.stream()
                .filter(person -> Gender.FEMALE .equals(person.getGender()))
                .collect(Collectors.toList());
    }
}

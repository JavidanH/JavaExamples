package functionalPrograming.functionalInterfaces;

import functionalPrograming.approachTypes.Gender;
import functionalPrograming.approachTypes.Person;

public class Consumer {

    public static void main(String[] args) {

        System.out.println(getPerson(new Person("Cavidan","Haciyev", Gender.MALE)));

    }

    static String getPerson (Person person){
            return  person.getName() + " " + person.getSurname();
    }
}

package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();



        list.add(new User(1,"Cavidan"));
        list.add(new User(2,"Afag"));
        list.add(new User(3,"Farida"));
        list.add(new User(4,"Lala"));
        list.add(new User(5,"Bahram"));
        list.add(new User(6,"Orxan"));

        list.forEach(User::toString);

        List<User> filtredList = list.stream().filter(user -> user.id>2).collect(Collectors.toList());

        Long countFiltered = list.stream().filter(user -> user.id>2).count();
        System.out.println(filtredList);

        System.out.println(countFiltered);
    }
}

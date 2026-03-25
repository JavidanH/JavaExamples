package stream;

public class User {
    Integer id;
    String name;


    public User (Integer id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {

        System.out.println(
                "User{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}'

        );
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

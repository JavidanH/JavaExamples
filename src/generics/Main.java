package generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();

        box1.set("table");

        Box<Integer> box2 = new Box<>();
        box2.set(12);

        System.out.println(box1);
        System.out.println(box2);
    }
}

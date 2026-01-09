package arrayListExamples;

import java.util.ArrayList;

public class ExampleFirst {
    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(45);
        arrayList.add(56);
        arrayList.add(78);

        System.out.println("Elements of Array : " + arrayList);

        arrayList.remove(3);
        System.out.println("After remove index 3 element of array: " + arrayList);

        arrayList.set(1,96);
        System.out.println("After change index  1 element of array: " + arrayList);

        System.out.println("Learn array size: " + arrayList.size());
    }
}

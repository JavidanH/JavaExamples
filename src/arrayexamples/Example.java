package arrayexamples;

public class Example {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Hyundai";
        System.out.println(cars[0]);
        System.out.println(cars[0].length());
        System.out.println(cars.length);

        String [] fruits = new String[4];


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "orange";
        fruits[3] = "pineapple";
        System.out.println(fruits[3]);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int[] numbers = {1, 5, 10, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum is: " + sum);

        int[] arr = new int[3];
        arr[0] = 5;
        arr[2] = 10;

        System.out.println(arr[1]);

        String[] items = new String[2];
        System.out.println(items[0].length());

    }
}

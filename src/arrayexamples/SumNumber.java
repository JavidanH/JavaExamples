package arrayexamples;

public class SumNumber {
    public static void main(String[] args) {
        int [] numbers = {5, 10, 15, 20, 25};
        int sumNumbers = 0;

        for ( int numbersNew : numbers){
            sumNumbers += numbersNew;

        }
        System.out.println("Ededlerin cemi: " + sumNumbers);
    }
}

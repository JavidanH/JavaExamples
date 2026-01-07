package arrayexamples;

public class FindMaxMin {
    public static void main(String[] args) {

        int[] numbers = {32,23,35,29,1,56,8,99,45};

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers){
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

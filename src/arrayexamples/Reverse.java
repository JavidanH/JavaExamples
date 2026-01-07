package arrayexamples;

public class Reverse {
    public static void main(String[] args) {
        int[] number = {2,4,6,8};

        for (int i = number.length - 1 ; i >= 0; i-- ){
            System.out.println(number[i]);
        }
    }
}

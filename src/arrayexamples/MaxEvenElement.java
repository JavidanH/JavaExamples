package arrayexamples;

public class MaxEvenElement {
    public static void main(String[] args) {

        int [] number = {2,5,67,84,53,96,87};
        int maxEven = Integer.MIN_VALUE;
        boolean found = false;

        for (int numbers : number){
            if ( numbers % 2 == 0 ){
                if (numbers > maxEven){
                    maxEven = numbers;
                    found = true;
                }
            }
        }
        if (found){
            System.out.println("Max even number: " + maxEven);
        } else {
            System.out.println("Not found max even!");
        }
    }
}

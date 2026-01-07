package arrayexamples;

public class FindZero {
    public static void main(String[] args) {
         int[] numbers = {4,5,-6,7,0,-5};

         for ( int n : numbers){
             if (n < 0){
                 continue;
             }
             if (n == 0){
                 break;
             }
             System.out.println(n);
         }
    }
}

package arrayexamples;

public class Example3 {
    public static void main(String[] args) {
        String [] str = {"alma", "armud","kelem" ,"salam", "ata","ana"};

        for (String str1 : str){
            if (str1.length() > 3){
                System.out.println(str1);
            }
        }
    }
}

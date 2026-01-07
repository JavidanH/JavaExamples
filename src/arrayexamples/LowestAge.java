package arrayexamples;

public class LowestAge {
    public static void main(String[] args) {
        int ages[] = {20,23,34,34,36,45,47,58,59};

        int length = ages.length;

        int lowestAge = ages[0];

        for (int age : ages){
            if (lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);
    }
}

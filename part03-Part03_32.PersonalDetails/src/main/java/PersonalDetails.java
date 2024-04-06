
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        int longest = 0;
        String theName = "";
        int count = 0;
        int total = 0;
        double average = 0.0;

        while (true){
            String sentence = scanner.nextLine();
            count ++;
            if(sentence.isEmpty()){
                break;
            }
            String splitting[] = sentence.split(",");
            int nameLength = splitting[0].length();
            int ageLength = splitting[1].length();
            if(nameLength > longest){
                longest = nameLength;
                theName = splitting[0];
            }
            total += Integer.valueOf(splitting[1]);
            average = (double) total/count;
        }
        System.out.println("Longest name: "+theName);
        System.out.println("Average of the birth years: "+average);
=======
>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9

    }
}

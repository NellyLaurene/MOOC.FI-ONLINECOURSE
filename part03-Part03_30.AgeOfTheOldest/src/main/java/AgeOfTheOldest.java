
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        int highest = 0;
        while(true){
            String sentence = scanner.nextLine();
            if(sentence.isEmpty()){
                break;
            }
            String words [] = sentence.split(",");
            int age = Integer.valueOf(words[1]);

            if(age > highest){
                highest=age;
            }
        }
        
        System.out.println("Age of the oldest: "+highest);
        
=======

>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
    }
}


import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        while(true){
            String sentence = scanner.nextLine();
            if(sentence.isEmpty()){
                break;
            }else {
                String words [] = sentence.split(" ");
                System.out.println(words[words.length-1]);
            }
        }
        
=======

>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
    }
}

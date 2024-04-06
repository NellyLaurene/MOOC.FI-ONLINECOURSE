
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
<<<<<<< HEAD
       Scanner scanner = new Scanner(System.in);

        while (true) {
            String inpVal = scanner.nextLine();
            if (inpVal.isEmpty()) {
                break;
            }
            String[] splittedStr = inpVal.split(" ");
            for (String word : splittedStr) {
                System.out.println(word);
            }

        }
        
=======
        Scanner scanner = new Scanner(System.in);


>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
    }
}

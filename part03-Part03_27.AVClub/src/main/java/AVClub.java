
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                return;
            }
            String[] partsArr = input.split(" ");
            for(String part : partsArr){
                if(part.contains("av")){
                    System.out.println(part);
                }
            }
        }
=======

>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
    }
}

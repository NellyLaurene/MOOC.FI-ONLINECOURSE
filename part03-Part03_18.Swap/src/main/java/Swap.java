
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
<<<<<<< HEAD
        
            System.out.println("Give two indices to swap:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int temp = array[a];
            array[a] = array [b];
            array[b] = temp;
        
=======

>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}

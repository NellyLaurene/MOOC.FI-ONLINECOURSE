
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            int number = scanner.nextInt();

            if (number == 9999){
                break;
            }
            list.add(number);
        }
        int small = list.get(0);
        int index =0;
        for (int i=0; i < list.size(); i++){
            if (list.get(i) < small){
                small = list.get(i);
                index = i;
            }
        }
        System.out.println("Smallest number: "+small);
        System.out.println("Found at index: "+index);
        
    }
}

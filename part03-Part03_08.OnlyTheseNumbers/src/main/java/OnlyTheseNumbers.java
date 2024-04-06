
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where? ");
        int x = scanner.nextInt();

        System.out.println("To where? ");
        int y = scanner.nextInt();

        System.out.println(numbers.get(x));
        System.out.println(numbers.get(y));

    }
}

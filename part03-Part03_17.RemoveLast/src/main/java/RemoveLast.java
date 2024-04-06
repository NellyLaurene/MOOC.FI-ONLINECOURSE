
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
<<<<<<< HEAD
        ArrayList<String> string = new ArrayList<>();
        
        System.out.println(string);
        
        
        string.add("First");
        string.add("Second");
        string.add("Third");
        
        removeLast(string);
        removeLast(string);
        
        System.out.println(string);
    }
    public static void removeLast(ArrayList<String>list){
        int size = list.size();
   
        if(size > 0){
            list.remove(size-1);
=======
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

    }
    public static void removeLast(ArrayList<String>strings){
        int length = strings.size();

        if (length == 0){
            strings.remove(length-1);
>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9
        }
    }

}
<<<<<<< HEAD


=======
>>>>>>> a372bfcb0ee518f1bf593570f2e2c3aba4028fa9

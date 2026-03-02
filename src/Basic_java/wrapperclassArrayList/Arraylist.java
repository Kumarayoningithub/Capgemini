package wrapperclassArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        // --- Example 1: Type-safe ArrayList (generics used) ---
        // Declares an ArrayList that can only hold String objects
        ArrayList<String> list1= new ArrayList<String>();
        
        // Adds String elements to the list
        list1.add("mango");
        list1.add("banana");
        list1.add("apple");
        
        // Prints the content of list1
        System.out.println(list1); 

        // --- Example 2: Non-type-safe ArrayList (raw type) ---
        // Declares an ArrayList using a raw type (no generics). 
        // It can hold objects of any type (implicitly stores 'Object' types).
        ArrayList list2 = new ArrayList(); 
        
        // Adds elements of various types (Integer, String, Character, Boolean, Double)
        list2.add(101);      // Auto-boxes int to Integer
        list2.add("Hello");
        list2.add('a');      // Auto-boxes char to Character
        list2.add(true);     // Auto-boxes boolean to Boolean
        list2.add(100.5);    // Auto-boxes double to Double
        
        // Prints the content of list2
        System.out.println(list2); 
    }
}

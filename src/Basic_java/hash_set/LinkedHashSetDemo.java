package hash_set;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(100);
		lhs.add(10);
		lhs.add(50);
		lhs.add(70);
		
		
		System.out.println(lhs);
		
		
		// iterate here using foreach, Iterator, ListIterator
		
		// for each loop
		for(Integer ele: lhs) {
			System.out.print(ele+" ");
		}
		
		// in listiterator we cant iterate ....
		
		// traverse using iterator..
		
//		Iterator<Integer> iterator = lhs.iterator(); // Corrected variable name to 'lhs'
//
//        // 3. Traverse the set using the iterator and a while loop
//        System.out.println("\nTraversing the LinkedHashSet using Iterator:");
//        while (iterator.hasNext()) {
//            Integer element = iterator.next(); // Get the next element
//            System.out.println(element)
//		
      
		ArrayList<Integer> al = new ArrayList<Integer>(lhs);
		
		ListIterator<Integer> itr = al.listIterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

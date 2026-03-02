package sorted_set;
import java.util.*;
public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> ss = new TreeSet<Integer>();
		
		
		ss.add(100);
		ss.add(10);
		ss.add(30);
		ss.add(40);
		ss.add(30);
		ss.add(50);
		ss.add(60);
		
		
		System.out.println(ss);
		
		//first()
		System.out.println("first(): "+ ss.first());
		
		// last()
		
		System.out.println("last(): "+ ss.last());
		
		// headaSet()
		
		System.out.println("headSet(): "+ss.headSet(100));
		
		// tailSet()
		
		System.out.println("tailSet(): "+ ss.tailSet(10));
		
		
		// subset()
		
		System.out.println("subset(): "+ ss.subSet(30, 60));
		
		// comparator
		
		System.out.println("comparator(): "+ss.comparator());
		

	}

}

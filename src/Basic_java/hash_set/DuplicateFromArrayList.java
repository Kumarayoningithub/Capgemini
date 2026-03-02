package hash_set;
import java.util.*;

public class DuplicateFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(10);
		ar.add(20);
		ar.add(40);
		ar.add(50);
		
		
		
		int n = ar.size();
		
		
		HashSet<Integer> h = new HashSet<>();
		
		for(int i =0;i<n;i++) {
         if(h.contains(ar.get(i))) {
        	 System.out.println(ar.get(i));
        	 
         }
        	   h.add(ar.get(i));
        	   
        	   
			
			
		}
		
		System.out.println(h);
		
		

	}

}

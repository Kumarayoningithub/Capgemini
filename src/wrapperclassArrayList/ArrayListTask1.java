package wrapperclassArrayList;

import java.util.*;

public class ArrayListTask1 {

	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
		 
		 list.add(100);
		 list.add(100.50);
		 
		 list.add("hello");
		 
		 list.add(true);
		 
		 list.add("world");
		 
		 
		 // remove --> hello & world using iterator
		 
		 
		 Iterator<Object> it = list.iterator();

	        while (it.hasNext()) {

	            Object obj = it.next();

	            if (obj.equals("hello") || obj.equals("world")) {
	                it.remove();   // safe removal
	            }
	        }

	        System.out.println(list);


	}

}

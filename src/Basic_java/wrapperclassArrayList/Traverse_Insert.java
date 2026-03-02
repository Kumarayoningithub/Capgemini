package wrapperclassArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Traverse_Insert {
	
	public static void main(String[] args) {
		
		ArrayList<String> language=new ArrayList<String>();
		language.add("Java");
		language.add("Python");
		language.add("C");
		language.add("C++");
		// for each -> traverse +insert(not possible) we get Concurrent Exception
//		for(String s:language) {
//			if(s.equals("Python")) {
//				language.add("Ruby");
//			}
//		}
		System.out.println("===============================");
		
		//iterator -> traverse+insert(not possible)
//		System.out.println(language);
//		Iterator<String> itr=language.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals("Python")) {
//			itr.add("Ruby");
//			}
//		}
//		System.out.println(language);
		
		//list iterator
		//listIterator -> traverse+insert(possible)
		
		ListIterator<String>itr2=language.listIterator();
		System.out.println(language);
		while(itr2.hasNext()) {
			if(itr2.next().equals("Python")) {
				itr2.add("Ruby");
			}
		}
		System.out.println(language);
		
		
	}

	
	

}

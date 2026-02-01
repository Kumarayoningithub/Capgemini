package wrapperclassArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Traverse_Remove {
	public static void main(String[] args) {
		ArrayList<String> language=new ArrayList<String>();
		language.add("Java");
		language.add("Python");
		language.add("C");
		language.add("C++");
		// for each -> traverse +remove(not possible) we get Concurrent Exception
//		for(String s:language) {
//			if(s.equals("Python")) {
//				language.remove(s);
//			}
//		}
		System.out.println("===============================");
		
		//iterator -> traverse+remove(possible)
		System.out.println(language);
		Iterator<String> itr=language.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Python")) {
			itr.remove();
			}
		}
		System.out.println(language);
		
		//list iterator
		//listIterator -> traverse+remove(possible)
		
		ListIterator<String>itr2=language.listIterator();
		System.out.println(language);
		while(itr2.hasNext()) {
			if(itr2.next().equals("Python")) {
				itr.remove();
			}
		}
		System.out.println(language);
		
		
	}

	
}

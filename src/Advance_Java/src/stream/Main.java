package stream;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> even = new ArrayList<>();
//		
//		
//		for(Integer n : list) {
//			if(n%2==0) {
//				even.add(n);
//		}
//		}
		
		List<Integer> even1 = list.stream()
								  .filter(n -> n%2 == 0) //Give logic --> If true then keep. If false then skip.
								  .toList(); //collect
		
		System.out.println(even1);
		//Collection > Stream > Filter > Transform > Collect > Result
		// Stream does not store any data
		
		
	}

}
		
		

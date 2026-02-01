package dsa.Stack;
import java.util.*;

public class Example_stack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(30);
		st.push(45);
		st.push(78);
		st.push(89);
		
		st.pop();
		
		System.out.println(st);
		
		while(!st.isEmpty()) {
			st.pop();
		}
		
		System.out.println(st);
		
		
      

	}

}

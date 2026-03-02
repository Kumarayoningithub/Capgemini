package stringbuilder;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram";
		String t = "nagaram";
		
		int n1 = s.length();
		int n2 = t.length();
		
		if(n1!=n2) {
			System.out.println("not a anagram");
			return;
		}
		
		char ch []= s.toCharArray();
		char dh []= t.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(dh);
		
		
		for(int i =0;i<n1;i++) {
			if(ch[i]!=dh[i]) {
				System.out.println("not a anagram");
				return;
			}
		}
		
		
   System.out.println("anagram");
	}

}

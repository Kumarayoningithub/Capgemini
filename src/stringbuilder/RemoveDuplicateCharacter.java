package stringbuilder;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String s = "aabaabbbcccd";
		
		// output-> abcd
		
		
		char [] ch = s.toCharArray();
		
		int n = ch.length;
		
		boolean b []= new boolean[n];
		
		
		for(int i =0;i<n;i++) {
			
			if(b[i]) continue;
			
			char z = ch[i];
			
			for(int j =i+1;j<n;j++) {
				if(z==ch[j]) {
					b[j]=true;
				}
			}
			
			
		}
		
		for(int i = 0; i < n; i++) {
            if(b[i]==false) {
                System.out.print(ch[i]);
            }
        }

	}

}

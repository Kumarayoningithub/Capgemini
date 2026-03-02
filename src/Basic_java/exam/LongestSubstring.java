package exam;

public class LongestSubstring {
	 public static void main(String[] args) {
	        String s = "abcabcbb";
	        int n = s.length();
	        int maxLength = 0;

	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {

	                String sub = s.substring(i, j + 1);
	                boolean flag = true;

	                for (int x = 0; x < sub.length(); x++) {
	                    for (int y = x + 1; y < sub.length(); y++) {
	                        if (sub.charAt(x) == sub.charAt(y)) {
	                            flag = false;
	                            break;
	                        }
	                    }
	                    if (!flag) {
	                        break;
	                    }
	                }

	                if (flag) {
	                    maxLength = Math.max(maxLength, sub.length());
	                }
	            }
	        }

	        System.out.println(maxLength);
	    }
}

package looping_statement.Assignment_github;

public class Range_sum_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: n:4, m:20
//		Output: 90
//
//		Explanation
//		Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
//		Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
//		Difference: 150 – 60 = 90
		
		
		int m = 20;
        int n = 4;

        int div = 0;      // sum of numbers divisible by n
        int notDiv = 0;   // sum of numbers not divisible by n

        for(int i = 1; i <= m; i++) {
            if(i % n == 0) {
                div += i;
            } else {
                notDiv += i;
            }
        }

        int diff = notDiv - div;
        System.out.println(diff);
		
		

	}

}

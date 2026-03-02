package looping_statement.Assignment_github;

public class Armstrong_number {

    public static void main(String[] args) {
        
    	int n = 153;
    	int k = n;

    	int count = String.valueOf(n).length(); // digit count

    	int sum = 0;

    	while(k != 0) {
    	    int ld = k % 10;
    	    sum += Math.pow(ld, count); 
    	    k = k / 10;
    	}

    	if(sum == n)
    	    System.out.println("Armstrong");
    	else
    	    System.out.println("Not Armstrong");

    }
}

package looping_statement.Assignment_github;

public class Tech_no {

    public static void main(String[] args) {
        
        int n = 2025;
        int k = n;   // store original number
        
        int count = 0;
        while(n != 0) {
            n = n / 10;
            count++;
        }
        
        if(count % 2 != 0) {
            System.out.println(k + " is NOT a Tech Number");
            return;
        }
        
        int div = 1;
        for(int i = 0; i < count/2; i++) {
            div = div * 10;
        }
        
        int first = k / div;
        int last  = k % div;
        
        int sum = first + last;
        
        if(sum * sum == k) {
            System.out.println(k + " is a Tech Number");
        } else {
            System.out.println(k + " is NOT a Tech Number");
        }
    }
}

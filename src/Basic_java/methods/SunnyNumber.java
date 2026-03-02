package methods;

public class SunnyNumber {
	
	public static void check(int a) {
		
        int sq = (int)Math.sqrt(a + 1);

        if(sq * sq == a + 1) {
            System.out.println(a + " is a Sunny Number");
        } else {
            System.out.println(a + " is NOT a Sunny Number");
        }
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check(15);
		check (14);

	}

}

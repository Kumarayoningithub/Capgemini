package user_input;
import java.util.*;
public class Program3 {
	// jagged array
	
	public static void main(String[] args) {
		
		   //jagged array
		   int[][] a=new int[3][];
		   a[0]=new int[3];
		   a[1]=new int[2];
		   a[2]=new int[5];
		   
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the elements");
		   for(int i=0;i<a.length;i++) {
			   for(int j=0;j<a[i].length;j++) {
				   a[i][j]=scan.nextInt();
			   }
		   }
		   
		   
		   for(int i=0;i<a.length;i++) {
			   for(int j=0;j<a[i].length;j++) {
				   System.out.print(a[i][j]+" ");
			   }
			   System.out.println();
		   }
	   }

}

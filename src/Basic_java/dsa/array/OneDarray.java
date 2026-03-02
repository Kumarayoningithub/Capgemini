package dsa.array;

public class OneDarray {

    public static void main(String[] args) {

        int a[] = {10, 30, 8, 6, 7, 2};
        int n = a.length;

       
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        

        System.out.println();
        

        int[] ans = new int[n + 1];

        int index = 3;
        int j = 0;

        for(int i = 0; i < ans.length; i++) {

            if(i == index) {
                ans[i] = 40;   
            } else {
                ans[i] = a[j]; 
                j++;
            }
        }

        
        
        
        

       
//        for(int i = 0; i < index; i++) {
//            ans[i] = a[i];
//        }
//
//       
//        ans[index] = 40;
//
//    
//        for(int i = index; i < n; i++) {
//            ans[i + 1] = a[i];
//        }

       
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

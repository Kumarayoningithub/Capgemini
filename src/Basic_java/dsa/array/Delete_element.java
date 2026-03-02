package dsa.array;

public class Delete_element {

    public static void main(String[] args) {

        int a[] = {10, 30, 8, 6, 7, 2};
        int n = a.length;

        int val = 30;
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] != val) {
                a[j] = a[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

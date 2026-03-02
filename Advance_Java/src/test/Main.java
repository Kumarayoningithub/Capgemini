package test;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            String s1 = sc.next();
            String s2 = sc.next();

            if (s1.length() != s2.length()) {
                System.out.println("NO");
                continue;
            }

            char[] ch = s1.toCharArray();
            char[] dh = s2.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(dh);

            boolean isAnagram = true;

            for (int j = 0; j < ch.length; j++) {
                if (ch[j] != dh[j]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

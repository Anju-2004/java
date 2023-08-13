package patterns.char_pattern;

import java.util.Scanner;

public class upper_tri_abcde_abcd_abc_ab_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int j=i,p='A'; j<n; j++){
                System.out.print((char)p++ +" ");
            }
            System.out.println();
        }
    }
}

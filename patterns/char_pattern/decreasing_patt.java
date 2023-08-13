package patterns.char_pattern;

import java.util.Scanner;

public class decreasing_patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1, k='E'; i <= n; i++, k--) {
            int p=k;
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print((char)p-- + " ");
            }
            System.out.println();
        }
    }
}

package patterns.char_pattern;

import java.util.Scanner;

public class rev_pattern_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int p='E';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)p-- + " ");
            }
            System.out.println();
        }
    }
}

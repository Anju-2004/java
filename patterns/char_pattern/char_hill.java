package patterns.char_pattern;

import java.util.Scanner;

public class char_hill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int p='A';
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print((char)p++ +" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((char)p++ +" ");
            }

            System.out.println();
        }
    }
}

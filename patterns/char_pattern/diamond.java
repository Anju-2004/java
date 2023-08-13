package patterns.char_pattern;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            for(int j=1+1; j<=i; j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }

        for(int i=2; i<=n; i++){
            int num= 65;
            num=ch+n;
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(ch+" ");
            }
            for(int j=i; j<n; j++){
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }
    }
}

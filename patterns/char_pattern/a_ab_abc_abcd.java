package patterns.char_pattern;

import java.util.Scanner;

public class a_ab_abc_abcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int p='A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)p++ + " ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            char ch='A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }

    public static class c_co_cod_code_coder_right {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String s=sc.next();
            int n=s.length();
            for(int i=1; i<=n; i++){
                int p=0;
                for(int j=i; j<n; j++){
                    System.out.print("  ");
                }
                for(int j=1; j<=i; j++, p++){
                    System.out.print(s.charAt(p)+" ");
                }
                System.out.println();
            }
        }
    }
}

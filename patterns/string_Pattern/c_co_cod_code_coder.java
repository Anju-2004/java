package patterns.string_Pattern;

import java.util.Scanner;

public class c_co_cod_code_coder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=1; i<=n; i++){
            int p=0;
            for(int j=1; j<=i; j++, p++){
                System.out.print(s.charAt(p)+" ");
            }
            System.out.println();
        }
    }
}

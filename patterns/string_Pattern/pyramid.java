package patterns.string_Pattern;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=1,p=0; i<=n; i++,p++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(s.charAt(p)+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(s.charAt(p)+" ");
            }
            System.out.println();
        }
    }
}

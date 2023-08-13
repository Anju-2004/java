package patterns.char_pattern;

import java.util.Scanner;

public class rev_diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,p='A'; i<=n; i++,p++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((char) p+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print((char) p+" ");
            }
            System.out.println();
        }
        for(int i=1,p='A'; i<n; i++,p--){
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print((char)(p+n-2)+" " );
            }
            for(int j=i; j<n-1; j++){
                System.out.print((char)(p+n-2)+" ");
            }
            System.out.println();
        }
    }
}

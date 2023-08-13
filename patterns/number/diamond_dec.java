package patterns.number;

import java.util.Scanner;

public class diamond_dec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        for(int i=1; i<n; i++, p++){
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print(p+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++, p--){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print(p+" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }

    }
}

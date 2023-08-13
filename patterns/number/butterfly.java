package patterns.number;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=1; j<=i; j++){
                System.out.print(p++ +" ");
            }
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1, k=1; j<=i; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=i; j<n; j++){
                System.out.print(p++ +" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=i,k=1; j<n; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}

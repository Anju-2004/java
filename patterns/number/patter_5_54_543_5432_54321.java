package patterns.number;

import java.util.Scanner;

public class patter_5_54_543_5432_54321 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=n;
            for(int j=1; j<=i; j++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
    }
}

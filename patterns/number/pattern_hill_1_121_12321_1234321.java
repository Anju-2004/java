package patterns.number;

import java.util.Scanner;

public class pattern_hill_1_121_12321_1234321 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print(p++ +" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
    }
}

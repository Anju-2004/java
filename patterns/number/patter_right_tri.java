package patterns.number;

import java.util.Scanner;

public class patter_right_tri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1, k=n; i<=n; i++, k--){
            int p=k;
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(p--+" ");
            }
            System.out.println();
        }
    }
}

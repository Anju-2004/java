package patterns.number;

import java.util.Scanner;

public class in_dec_hill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,p=n; i<=n; i++,p--){
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
    }
}

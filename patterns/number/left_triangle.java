package patterns.number;

import java.util.Scanner;

public class left_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}

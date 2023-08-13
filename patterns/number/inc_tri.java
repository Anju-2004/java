package patterns.number;

import java.util.Scanner;

public class inc_tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,p=1; i<=n; i++,p++){
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

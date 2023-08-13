package patterns.number;

import java.util.Scanner;

public class pattern12345_1234_123_12_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i,p=1; j<=n; j++,p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

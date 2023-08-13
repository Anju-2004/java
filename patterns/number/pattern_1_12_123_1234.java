package patterns.number;

import java.util.Scanner;

public class pattern_1_12_123_1234 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1,p=1; j<=i; j++,p++){
                    System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

package patterns.hollow_pattern;

import java.util.Scanner;

public class right_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                if(i==j || i==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

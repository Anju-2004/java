package Factorial_prog;

import java.util.Scanner;

public class composite_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>3){
            System.out.print("Composite no.");
        }
        else{
            System.out.print("Not composite no.");
        }
    }
}

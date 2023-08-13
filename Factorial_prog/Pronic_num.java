package Factorial_prog;

import java.util.Scanner;

public class Pronic_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                if(i*(i+1)==n){
                    fact= i;
                }
            }
        }
        if(fact!=0){
            System.out.println("pronic num");
        }
        else{
            System.out.println("non pronic num");
        }
    }
}

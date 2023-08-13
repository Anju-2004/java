package Factorial_prog;

import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==m){
            System.out.println("perfect num");
        }
        else{
            System.out.println("not perfect num");
        }
    }
}

package Number_programs;

import java.util.Scanner;
/* neon number => 9^2 = 81
*    8+1 =9
*    sum of square of a digits of number is equal to the number itself */
public class neon_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        n=n*n;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(sum==m){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }
    }
}

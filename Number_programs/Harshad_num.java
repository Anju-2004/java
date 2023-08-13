package Number_programs;

import java.util.Scanner;
/* harshad number = sum of digits is able to divide the number itself
*   156 = 1+5+6 =12    156 % 12 ==0     */
public class Harshad_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while(n!=0){
            int d= n%10;
            sum=sum+d;
            n=n/10;
        }
        if(m%sum==0){
            System.out.println("Harshad number");
        }
        else {
            System.out.println("Not harshad number");
        }
    }
}

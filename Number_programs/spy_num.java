package Number_programs;

import java.util.Scanner;
/*spy number= sum = prod  of a number
*  123 =>  1+2+3  ==  1*2*3  => 6 */
public class spy_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int prod=1;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            prod=prod*d;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(prod);
        if(sum==prod){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}

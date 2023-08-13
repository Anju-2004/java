package Number_programs;

import java.util.Scanner;
/* special number is number 59 = 5+9 + 5*9   */
public class Special_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        int prod=1;
        int ans=0;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            prod=prod*d;
            ans=sum+prod;
            n=n/10;
        }
        System.out.println(ans);
        if(ans==m){
            System.out.println("Special number");
        }
        else{
            System.out.println("Not a special number");
        }
    }
}

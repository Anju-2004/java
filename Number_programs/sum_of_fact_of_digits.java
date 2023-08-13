package Number_programs;

import java.util.Scanner;

public class sum_of_fact_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int fact=1;
        int sum=0;
        while(n!=0){
            int d= n%10;
            for(int i=1; i<=d; i++){
                fact=fact*i;
                System.out.println("fact: "+fact);
            }
            sum=sum+fact;
            fact=1;

            n=n/10;
        }
        System.out.println(sum);
        if(sum==m){
            System.out.println("special num");
        }
        else{
            System.out.println("not special num");
        }
    }
}

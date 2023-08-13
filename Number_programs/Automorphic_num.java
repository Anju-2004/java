package Number_programs;

import java.util.Scanner;

public class Automorphic_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int flag=0;
        int sq = n*n;
        while(n!=0){
            int d=n%10;
            int d1= sq %10;
            if(d!=d1) flag=1;
            n=n/10;
            sq=sq/10;
        }
        if(flag==0){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not a automorphic number");
        }
    }
}

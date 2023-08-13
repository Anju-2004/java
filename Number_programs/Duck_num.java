package Number_programs;

import java.util.Scanner;

public class Duck_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int count=0;
        while(n!=0){
            int d=n%10;
            if(d==0) count++;
            n=n/10;
        }
        if(count>0){
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a duck number");
        }
    }
}

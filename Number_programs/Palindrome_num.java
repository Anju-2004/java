package Number_programs;

import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=(sum*10)+d;
            n=n/10;
        }
        if(sum==m){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

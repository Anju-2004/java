package Number_programs;

import java.util.Scanner;

public class digits_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int m=n;
        while(n!=0){
            int d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}

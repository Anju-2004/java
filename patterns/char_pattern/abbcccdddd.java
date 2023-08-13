package patterns.char_pattern;

import java.util.Scanner;

public class abbcccdddd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
        System.out.println();
        for(int i=1, p='A'; i<=n; i++, p--){
            for(int j=1; j<=i; j++){
                System.out.print((char)(p+n-1)+" ");
            }
            System.out.println();
        }
    }
}

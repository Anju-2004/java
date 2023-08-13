package java_basics;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float sum=0;
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            float x = sc.nextInt();
            sum+=x;
        }
        sc.close();
        float ans = sum / n;
        System.out.println(ans);
    }
}

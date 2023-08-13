package patterns.char_pattern;
import java.util.Scanner;
public class zzzzz0000zzz00z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1+1; j <= i; j++) {
                System.out.print("  ");
            }
            if(i%2==0){
                for(int j=i; j<=n; j++){
                    System.out.print("0 ");
                }
            }
            else{
                for(int j=i; j<=n; j++){
                    System.out.print("Z ");
                }
            }
            System.out.println();
        }
    }
}

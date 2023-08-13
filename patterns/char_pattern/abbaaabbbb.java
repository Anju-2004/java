package patterns.char_pattern;
import java.util.Scanner;
public class abbaaabbbb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("B ");
                }
            }
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }

    public static class redoc_rev {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s= sc.next();
            int n=s.length();
            for(int i=1,k=n-1; i<=n; i++,k--){
                int p=k;
                for(int j=2; j<=i; j++){
                    System.out.print("  ");
                }
                for(int j=i; j<=n; j++,p--){
                        System.out.print(s.charAt(p)+" ");

                }
                System.out.println();
            }
        }
    }
}

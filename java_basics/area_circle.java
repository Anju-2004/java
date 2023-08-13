package java_basics;

import java.util.Scanner;

public class area_circle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        double pi= 3.1415;
        double area= pi * radius * radius;
        System.out.println(area);
        double cir = 2 * pi * radius;
        System.out.println(cir);
    }
}

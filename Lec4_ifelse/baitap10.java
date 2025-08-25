package Lec4_ifelse;

import java.util.Scanner;

public class baitap10 {
    public static int triangle(float a, float b, float c)
    {
        if(a + b > c)
        {
            if(a == b && b == c)
            {
                System.out.println("equilateral!");
            }
             else if(a==b || a == c || b == c){
                    System.out.println("isosceles");
                }
            else if(a != b && b != c)
            {
                System.out.println("scalene ");
            }
        }
        return 0;
    }
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();
        System.out.println(triangle(a,b,c));
    }
}

package Lec4_ifelse;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("Day la so chan!");
        }else
        {
            System.out.println("Day la so le!");}
    }
}

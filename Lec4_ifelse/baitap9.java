package Lec4_ifelse;

import java.util.Scanner;

public class baitap9 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int x = sc.nextInt();
        x = (x >= 0)? x : -x;
        System.out.println(x);
    }
}

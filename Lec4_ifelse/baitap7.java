package Lec4_ifelse;

import java.util.Scanner;

public class baitap7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        int a = sc.nextInt();
        System.out.println("Nhap so thu 2: ");
        int b = sc.nextInt();
        System.out.println("Nhap so thu 3: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

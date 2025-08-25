package Lec4_ifelse;

import java.util.Scanner;

public class baitap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Day la nam nhuan");
        } else {
            System.out.println("Day khong phai la nam nhuan");
        }
    }
}

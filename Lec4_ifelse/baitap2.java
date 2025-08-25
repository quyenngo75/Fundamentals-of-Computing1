package Lec4_ifelse;

import java.util.Scanner;

public class baitap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        if (age <= 0) {
            System.out.println("Tuoi khong hop le!");
        } else {
            if (age < 12) {
                System.out.println("Ban la con nit!");
            } else if (age < 19) {
                System.out.println("Ban dang la thanh nien!");
            } else if (age < 59) {
                System.out.println("Ban la nguoi lon!");
            } else {
                System.out.println("Xin chao ong cu!");
            }
        }
    }
}

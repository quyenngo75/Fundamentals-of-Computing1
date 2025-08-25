package Lec4_ifelse;

import java.util.Scanner;

public class baitap6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem trung binh!");
        double x = sc.nextDouble();
        if (x > 10 && x < 0) {
            System.out.println("Nhap sai!");
        } else {
            if (x < 5) {
                System.out.println("Fail");
            } else if (x < 6.5) {
                System.out.println("Avarage");
            } else if (x < 8.0) {
                System.out.println("Fair");

            } else if (x < 9.0) {
                System.out.println("Good");
            } else if (x < 10.0) {
                System.out.println("Excellent");
            }
        }
    }
}

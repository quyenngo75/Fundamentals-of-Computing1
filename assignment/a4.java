package assignment;

import java.util.Scanner;

public class a4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thuc 1: ");
        float float1 = sc.nextFloat();
        System.out.println("Nhap so thuc 2: ");
        float float2 = sc.nextFloat();
        float avarage = (float1 + float2) / 2;
        System.out.println("Trung binh 2 so thuc: " + avarage);
    }
}

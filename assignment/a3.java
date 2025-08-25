package assignment;

import java.util.Scanner;

public class a3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen 1: ");
        int int1 = sc.nextInt();
        System.out.println("Nhap so nguyen 2: ");
        int int2 = sc.nextInt();
        int sum = int1 + int2;
        System.out.println("Tong 2 so nguyen la: " + sum);
    }
}

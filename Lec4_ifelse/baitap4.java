package Lec4_ifelse;

import java.util.Scanner;

public class baitap4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap phep tinh (+, -, *, /)");
        String phepTinh = sc.nextLine();
        int c = 0;
        switch (phepTinh) {
            case "+":
                c = a + b;
                System.out.println(c);
                break;
            case "-":
                c = a - b;
                System.out.println(c);
                break;
            case "*":
                c = a * b;
                System.out.println(c);
                break;
            case "/":
                if (b != 0) {
                    c = a / b;
                    System.out.println(c);
                } else {
                    System.out.println("loi!");
                }
                break;

        }
    }
}

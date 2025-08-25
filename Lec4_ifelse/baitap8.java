package Lec4_ifelse;

import java.util.Scanner;

public class baitap8 {

    public static int quadrant (float x, float y) {
        if (x > 0 && y > 0) {
            System.out.println("Day la goc phan tu thu 1!");
        } else if (x < 0 && y > 0) {
            System.out.println("Day la goc phan tu thu 2!");
        } else if (x < 0 && y < 0) {
            System.out.println("Day la goc phan tu thu 3!");
        } else if (x == 0 || y == 0) {
            System.out.println("Day la goc phan tu thu 4!");
        }else {
        return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        float x = sc.nextFloat();
        System.out.println("Nhap y: ");
        float y = sc.nextFloat();
        System.out.println(quadrant(x,y));
    }
}

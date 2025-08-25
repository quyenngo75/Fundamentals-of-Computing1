package assignment;

import java.util.Scanner;

public class a2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.println("Ban ten la " + name + " ban " + tuoi + " tuoi");
    }
}

package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class E5_Filter_Even_Numbers {

    public static ArrayList<Integer> elements(int a[]) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenList.add(a[i]);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang ");
        int n = sc.nextInt();
        int a[] = new int[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri cua phan tu trong mang: ");
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> result = elements(a);
        System.out.println("Cac so chan trong mang: " + result);
    }
}

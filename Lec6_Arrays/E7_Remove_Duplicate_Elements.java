package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class E7_Remove_Duplicate_Elements {

    public static ArrayList<Integer> remove(int a[]) {
        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!removeList.contains(a[i])) {
                removeList.add(a[i]);
            }
        }
        return removeList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri a[" + i + "] ");
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> result = remove(a);
        System.out.println("Mang sau khi xoa phan tu trung nha"+result);
    }
}

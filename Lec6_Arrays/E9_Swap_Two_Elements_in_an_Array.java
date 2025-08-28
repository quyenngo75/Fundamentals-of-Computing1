package Lec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E9_Swap_Two_Elements_in_an_Array {
    public static void swap(int a[], int index1, int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri: ");
            a[i] =sc.nextInt();
        }
        swap(a,0,2);
        System.out.println(Arrays.toString(a));
    }
}

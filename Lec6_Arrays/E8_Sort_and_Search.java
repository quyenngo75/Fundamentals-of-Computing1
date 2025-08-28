package Lec6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E8_Sort_and_Search {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap gia tri: ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep "+Arrays.toString(a));
        System.out.println("Nhap so can tim: ");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < 5; i++) {
            if(a[i] == num)
            {
                index = i;
            }
        }
              if(index != -1){
            System.out.println("So can tim nam o vi tri thu" +index);
            }
            else{
                System.out.println("Khong tim thay so can tim ");
            }
    }
}

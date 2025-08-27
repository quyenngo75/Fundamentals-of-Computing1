package Lec6_Arrays;

import java.util.Scanner;

public class E2_Reverse_an_Array {

    public static int reveres(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of arrays: ");
        int numbers = sc.nextInt();
        int[] a = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter value of arrays: ");
            a[i] = sc.nextInt();
        }
        reveres(a);
        System.out.println("Arrays after reversal: ");
        for (int i = 0; i < numbers; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}

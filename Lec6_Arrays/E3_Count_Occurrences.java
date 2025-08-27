package Lec6_Arrays;

import java.util.Scanner;

public class E3_Count_Occurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int numbers = sc.nextInt();
        int[] a = new int[numbers];
        int count = 0;
        System.out.println("Enter number X to find: ");
        int X = sc.nextInt();
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter value: ");
            a[i] = sc.nextInt();
            if (a[i] == X) {
                count++;
            }
        }
        System.out.println("X is called: " + count);
    }
}

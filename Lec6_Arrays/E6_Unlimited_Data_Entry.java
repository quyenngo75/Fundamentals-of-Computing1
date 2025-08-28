package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class E6_Unlimited_Data_Entry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> element = new ArrayList<>();
        
        int sum = 0;
        while (true) {
            System.out.println("Nhap a[" + element.size() + "] ");
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            element.add(n);
            sum += n;
        }

        System.out.println(element);
        System.out.println(sum);
    }
}

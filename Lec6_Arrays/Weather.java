package Lec6_Arrays;

import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days temperutes? 7");
        int days = sc.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + " high temps: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double avarage = sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > avarage) {
                count++;
            }
        }
        System.out.println("Avarage temps: " + avarage);
        System.out.println(count + " days above avarage!");
    }
}

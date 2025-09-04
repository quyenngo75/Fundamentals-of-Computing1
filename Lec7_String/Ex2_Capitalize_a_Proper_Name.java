package Lec7_String;

import java.util.Scanner;

public class Ex2_Capitalize_a_Proper_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String formatted = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(formatted).append(" ");
        }
        System.out.println("Ten sau khi chuan hoa: " + result.toString().trim());
    }
}

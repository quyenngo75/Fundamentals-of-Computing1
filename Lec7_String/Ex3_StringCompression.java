package Lec7_String;

import java.util.Scanner;

public class Ex3_StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("Chuoi sau khi nen: " + compressed.toString());
    }
}

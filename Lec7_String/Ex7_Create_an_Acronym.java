
package Lec7_String;

import java.util.Scanner;

public class Ex7_Create_an_Acronym {
    public static String createAcronym(String phrase) {
        // Tách thành các từ (cách nhau bởi khoảng trắng)
        String[] words = phrase.trim().split("\\s+");

        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            // Lấy chữ cái đầu tiên của mỗi từ, viết hoa
            acronym.append(Character.toUpperCase(word.charAt(0)));
        }

        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập cụm từ
        System.out.print("Nhap cum tu: ");
        String phrase = sc.nextLine();

        // Tạo từ viết tắt
        String result = createAcronym(phrase);

        // In kết quả
        System.out.println("Acronym: " + result);
    }
}

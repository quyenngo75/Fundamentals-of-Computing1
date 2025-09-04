
package Lec7_String;

import java.util.Scanner;

public class Ex8_Count_Words_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        // Xóa khoảng trắng đầu/cuối và tách theo 1 hoặc nhiều khoảng trắng
        String[] words = input.trim().split("\\s+");

        // Nếu chuỗi rỗng sau khi trim thì số từ = 0
        int count = (input.trim().isEmpty()) ? 0 : words.length;

        System.out.println("So tu trong chuoi la: " + count);
    }
}

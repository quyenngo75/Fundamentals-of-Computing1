
package Lec7_String;

import java.util.Scanner;

public class Ex9_Format_a_Number_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi so: ");
        String number = sc.nextLine();

        StringBuilder sb = new StringBuilder(number);

        // Duyet nguoc, moi 3 ky tu thi chen dau phay
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }

        System.out.println("So sau khi dinh dang: " + sb.toString());
    }
}

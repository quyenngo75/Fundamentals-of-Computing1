package Lec7_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_Check_for_Anagrams {

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat: ");
        String str1 = sc.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Hai chuoi la Anagram.");
        } else {
            System.out.println("Hai chuoi khong la Anagram.");
        }
    }
}

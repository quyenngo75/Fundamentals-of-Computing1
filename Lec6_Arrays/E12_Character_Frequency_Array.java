package Lec6_Arrays;

import java.util.Scanner;


public class E12_Character_Frequency_Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi (chi chu cai thuong)");
        String text = sc.nextLine();
        int character[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c > 'a' && c <'z')
            {
                character[c - 'a']++;
            }
        }
        System.out.println("Tan suat cac ky tu: ");
        for (int i = 0; i < 26; i++) {
            if(character[i] > 0)
            {
                System.out.println((char)(i+'a') + ": " +character[i]);
            }
        }
    }
}

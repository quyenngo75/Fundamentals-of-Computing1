package Lec7_String;

import java.util.Scanner;

public class Ex1_Reverse_the_Words_in_a_Sentence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cau: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Cau sau khi dao nguoc tu: " + reversed.toString());
    }
}

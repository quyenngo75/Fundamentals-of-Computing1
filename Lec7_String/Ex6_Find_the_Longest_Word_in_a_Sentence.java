package Lec7_String;

import java.util.Scanner;

public class Ex6_Find_the_Longest_Word_in_a_Sentence {
     public static String findLongestWord(String sentence) {
        // Tách câu thành các từ (cách nhau bởi khoảng trắng)
        String[] words = sentence.split(" ");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập câu
        System.out.print("Nhap cau: ");
        String sentence = sc.nextLine();

        // Tìm từ dài nhất
        String longestWord = findLongestWord(sentence);

        // In kết quả
        System.out.println("Tu dai nhat: " + longestWord);
    }
}

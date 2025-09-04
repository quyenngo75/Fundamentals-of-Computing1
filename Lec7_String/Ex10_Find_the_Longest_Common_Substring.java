package Lec7_String;

public class Ex10_Find_the_Longest_Common_Substring {

    public static String findLongestCommonSubstring(String s1, String s2) {
        // Đảm bảo s1 là chuỗi ngắn hơn
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        String longest = "";

        // Duyệt tất cả substring của s1
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "XBCYDEFZ";

        String result = findLongestCommonSubstring(str1, str2);
        System.out.println("Longest Common Substring: " + result);
    }
}

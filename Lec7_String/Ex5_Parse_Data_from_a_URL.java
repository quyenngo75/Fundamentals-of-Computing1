
package Lec7_String;

import java.util.Scanner;

public class Ex5_Parse_Data_from_a_URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập URL
        System.out.print("Nhap URL: ");
        String url = sc.nextLine();

        // Tìm vị trí kết thúc protocol
        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);

        // Bắt đầu tìm domain sau "://"
        int domainStart = protocolEnd + 3;

        // Tìm dấu "/" đầu tiên sau domain
        int pathStart = url.indexOf("/", domainStart);

        String domain;
        String path;

        if (pathStart == -1) {
            // Không có path
            domain = url.substring(domainStart);
            path = "";
        } else {
            domain = url.substring(domainStart, pathStart);
            path = url.substring(pathStart);
        }

        // In kết quả
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}

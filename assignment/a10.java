package assignment;

import java.util.Scanner;

public class a10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");
        System.out.print("Nhap tu tach ra boi ',' ");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}

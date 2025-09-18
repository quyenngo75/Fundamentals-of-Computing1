package Lec3_Scanner;
import java.util.Scanner;
public class slide13 {
    public static void main(String args[])
    {
        //slide 13
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thuc: ");
        float number = sc.nextFloat();
        System.out.println(number);
        
        //slide 14
        System.out.println("Nhap boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println(b);
        
        //slide 15
        System.out.println("nhap string: ");
        String word = sc.next();
        System.out.println(word);
        
        //silde 16
        System.out.println("Nhap cau: ");
        sc.nextLine();
        String sentence = sc.nextLine();
        System.out.println(sentence);
        
        
    }
}

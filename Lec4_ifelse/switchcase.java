package Lec4_ifelse;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri n: ");
        int n = sc.nextInt();
    switch(n){
        case 1: System.out.println("hello"); break;
        case 2: System.out.println("anh em"); break;
        case 3: System.out.println("ba con"); break;
        default:
            System.out.println("sai roi em");
    }
    }
}

package assignment;
import java.util.Scanner;
public class a9 {
    public static void main(String args[] )
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int soNguyen = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap chuoi: ");
        String chuoi = sc.nextLine();
        
        System.out.println("So nguyen la: "+soNguyen);
        System.out.println("Chuoi la: "+chuoi);
    } 
}
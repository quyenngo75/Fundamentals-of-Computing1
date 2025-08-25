package Lec3;
import java.util.Scanner;
public class exercise {
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);
        //1
        int a =5;
        System.out.println("So nguyen dau tien " +a);
        
        //2
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.println("Ban ten la " +name + " ban " +tuoi+ " tuoi");
        
        //3
        System.out.println("Nhap so nguyen 1: ");
        int int1 = sc.nextInt();
        System.out.println("Nhap so nguyen 2: ");
        int int2 = sc.nextInt();
        int sum = int1 + int2;
        System.out.println("Tong 2 so nguyen la: "+ sum);
        
        //4
        System.out.println("Nhap so thuc 1: ");
        float float1 = sc.nextFloat();
        System.out.println("Nhap so thuc 2: ");
        float float2 = sc.nextFloat();
        float avarage = (float1 + float2) / 2;
        System.out.println("Trung binh 2 so thuc: "+avarage);
        
        //5
        System.out.println("Nhap gia tri boolean (true or false): ");
        boolean boo = sc.nextBoolean();
        System.out.println(boo);
    }
}

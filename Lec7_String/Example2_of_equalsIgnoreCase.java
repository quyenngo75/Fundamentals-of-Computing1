
package Lec7_String;

public class Example2_of_equalsIgnoreCase {
    public static void main(String[] args)
    {
        //equalsIgnoreCase: khong phan biet chu hoa chu thuong
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

package Lec7_String;

public class Example_of_equals {

    public static void main(String[] args) {
        //equals(): so sanh noi dung
        // == : so sanh tham chieu
        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        String s4 = "hello world1";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}

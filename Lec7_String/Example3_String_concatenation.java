package Lec7_String;

public class Example3_String_concatenation {

    public static void main(String[] args) {
        String s1 = "dai hoc";
        String s2 = s1.concat("duy tan");
        String name = s1 + s2;
        System.out.println(s2);
        System.out.println(name);
    }
}

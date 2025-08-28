package Lec6_Arrays;

import java.util.ArrayList;

public class E15_Convert_Between_Array_and_ArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }


    public static void main(String[] args) {

        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list1 = arrayToArrayList(arr);
        System.out.println("Array -> ArrayList: " + list1);

    
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charles");
        list2.add("David");
        String[] arr2 = arrayListToArray(list2);

        System.out.print("ArrayList -> Array: ");
        for (String s : arr2) {
            System.out.print(s + " ");
        }
    }
}



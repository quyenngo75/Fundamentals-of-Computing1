package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class E14_Removing_Elements_from_an_ArrayList_during_Iteration {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));
        
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }

        System.out.println("Danh sach sau khi xoa: " + list);
    }
}

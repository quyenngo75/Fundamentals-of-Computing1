package Lec6_Arrays;

import java.util.Arrays;

public class E10_Concatenate_Two_Arrays {
        public static int[] merge(int[] a1, int[] a2) {
            int[] newArray = new int[a1.length + a2.length];

            for (int i = 0; i < a1.length; i++) {
                newArray[i] = a1[i];
            }

            for (int j = 0; j < a2.length; j++) {
                newArray[a1.length + j] = a2[j];
            }

            return newArray;
        }

        public static void main(String[] args) {
            int[] a1 = {1, 2, 3};
            int[] a2 = {4, 5, 6};

            int[] merged = merge(a1, a2);

            System.out.println("New array: " + Arrays.toString(merged));
        }
    }


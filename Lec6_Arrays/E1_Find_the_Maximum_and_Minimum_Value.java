
package Lec6_Arrays;

import java.util.Scanner;


public class E1_Find_the_Maximum_and_Minimum_Value {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of arrays ");
        int numbers = sc.nextInt();
        int[] a = new int[numbers];
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter value "+(i+1));
            a[i] = sc.nextInt();
            if(a[i] > max)
            {
                max = a[i];
            }
            min = a[0];
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("The maximum number is: " +max);
        System.out.println("The minimum number is: " +min);
    }
}

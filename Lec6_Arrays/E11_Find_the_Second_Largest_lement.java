package Lec6_Arrays;

public class E11_Find_the_Second_Largest_lement {

    public static void main(String[] args) {
        int[] a = {10, 5, 8, 20, 15, 20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] < largest) {

                secondLargest = a[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Không có phần tử lớn thứ hai (mảng toàn số giống nhau).");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }
}

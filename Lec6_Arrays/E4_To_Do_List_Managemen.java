package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class E4_To_Do_List_Managemen {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new tasks ");
            System.out.println("2. view all tasks ");
            System.out.println("3. Remove a task by its position (index). ");
            System.out.println("0. QUIT");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten cong viec: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Da them cong viec");
                    break;
                case 2:
                    System.out.println("Danh sach cong viec: ");
                    if (tasks.isEmpty()) {
                        System.out.println("Danh sach rong ");

                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap vi tri cong viec muon xoa");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon k hop le!");

            }
        } while (choice != 0);
    }
}

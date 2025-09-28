package Code6_OOP_ROOOM;

import java.util.Scanner;

public class processor {
    
    public static void main(String[] args) {
        int choose = 0;
        RoomList rooml = new RoomList();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("chosse");
            System.out.println("0 = exit");
            System.out.println("1 = addroom");
            System.out.println("2 = display details all ");
            System.out.println("3 = find most expensive room ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int chon = 0;
                    System.out.println("1 Meeting room 2 Bed room ");
                    System.out.print("choose: ");
                    chon = sc.nextInt();
                    if (chon == 1) {
                        MeetingRoom MT = new MeetingRoom();
                        MT.addroom();
                        rooml.addroom(MT);
                    } else if (chon == 2) {
                        BedRoom br = new BedRoom();
                        br.addroom();
                        rooml.addroom(br);
                    }
                    
                    break;
                case 2:
                    rooml.displaydetailsall();
                    break;
                case 3:
                   Room expensive = rooml.findMostExpensiveRoom();
                    if (expensive != null) {
                        System.out.println("Expensive room: ");
                        expensive.displaydetails();
                    } else {
                        System.out.println("No room found!");
                    }
                case 4:
                    String
                 
                    
            }
        } while (choose != 0);
        {
            System.out.println("exit completed");
        }
    }
}

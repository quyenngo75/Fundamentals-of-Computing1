package Code8_OOP_ROOM;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList roomList = new RoomList();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("(0) exit sign\n"
                    + "(1) Add a new Room (Meeting Room/Bed Room)\n"
                    + "(2) Update a room by ID \n"
                    + "(3) Delete a room by ID \n"
                    + "(4) Find a room by ID \n"
                    + "(5) Display all rooms \n"
                    + "(6) Find the most expensive room \n"
                    + "(7) Count the total number of rooms ");
            choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Exit program");
                    break;
                case 1:
                    int type;
                    System.out.println("Choose 1.MeetingRoom || 2.BedRoom");
                    type = sc.nextInt();
                    if (type == 1) {
                        MeetingRoom mtr = new MeetingRoom();
                        mtr.addRoom();
                        roomList.addRoom(mtr);
                    } else if (type == 2) {
                        BedRoom br = new BedRoom();
                        br.addRoom();
                        roomList.addRoom(br);
                    } else {
                        System.out.println("Eroor!");
                    }
                    break;
                case 2:
                    System.out.println("Enter id to update: ");
                    sc.nextLine();
                    String updateId = sc.nextLine();
                    if (roomList.updateRoomById(updateId)) {
                        System.out.println("Update is successfully");
                    } else {
                        System.out.println("not found id to update!!!");
                    }
                    break;
                case 3:

                    System.out.println("Enter id to delete: ");
                    sc.nextLine();
                    String deletedId = sc.nextLine();
                    if (roomList.deleteRoomById(deletedId)) {
                        System.out.println("Deleted is succesfully");
                    } else {
                        System.out.println("Not found id to deleted!!!");
                    }
                    break;
                case 4:

                    System.out.println("Enter id to find: ");
                    sc.nextLine();
                    String findId = sc.nextLine();
                    Room r = roomList.findRoomById(findId);
                    if (r != null) {
                        r.disPlayDetails();
                    } else {
                        System.out.println("Not found id to find!!!");
                    }
                    break;
                case 5:
                    System.out.println("=====LIST ROOM=====");
                    roomList.disPlayAllRoom();
                    break;
                case 6:
                    System.out.println("Most expensive room: ");
                    roomList.findMostExpensiveRoom().disPlayDetails();
                    break;
                case 7:
                    roomList.countRoom();
                    break;
                default:
                    System.out.println("Enter again!");
            }
        } while (choose != 0);
    }
}

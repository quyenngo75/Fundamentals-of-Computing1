package Code3_OOP_ROOM;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList roomList = new RoomList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------MENU-------");
            System.out.println("(1) Add a new Room (Meeting Room / Bed Room) \n"
                    + "(2) Update a room by ID \n"
                    + "(3) Delete a room by ID \n"
                    + "(4) Find a room by ID \n"
                    + "(5) Display all rooms \n"
                    + "(6) Find the most expensive room \n"
                    + "(7) Count the total number of rooms");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter 1.Meeting Room 2.Bed Room");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        MeetingRoom mtr = new MeetingRoom();
                        mtr.addRoom();
                        roomList.addRoom(mtr);
                    } else if (type == 2) {
                        BedRoom br = new BedRoom();
                        br.addRoom();
                        roomList.addRoom(br);
                    } else {
                        System.out.println("Erorr!");
                    }
                    break;
                case 2:
                    System.out.println("Enter id to update: ");
                    String idUpdate = sc.nextLine();
                    if (!roomList.updateRoomById(idUpdate)) {
                        System.out.println("not found!");
                    } else {
                        System.out.println("Update successfully!");
                    }
                    break;
                case 3:
                    System.out.println("Enter id to deleted");
                    String deletedId = sc.nextLine();
                    if (!roomList.deleteRoomById(deletedId)) {
                        System.out.println("not found");
                    } else {
                        System.out.println("Deleted is successfully!");
                    }
                    break;
                case 4:
                    System.out.println("Enter id to find");
                    String findId = sc.nextLine();
                    Room r = roomList.findRoomById(findId);
                    if (roomList.findRoomById(findId) == null) {
                        System.out.println("not found");
                    } else {
                        r.disPlayDetails();
                    }
                case 5:
                    System.out.println("-------LIST ROOM------");
                    roomList.disPlayAllRoom();
                case 6:
                    Room expensive = roomList.findMostExpensiveRoom();
                    if (expensive != null) {
                        System.out.println("Expensive room: ");
                        expensive.disPlayDetails();
                    } else {
                        System.out.println("No room found!");
                    }
            }
        } while (choice != 0);

    }
}

package Assignment10.OOP_ROOM;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList roomList = new RoomList();
        System.out.println("Enter number of rooms: ");
        int room = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < room; i++) {
            System.out.println("choose 1.MeetingRoom  2.BedRoom ");
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 1) {
                MeetingRoom mt = new MeetingRoom();
                mt.addRoom();
                roomList.addRoom(mt);
            } else if (choose == 2) {
                BedRoom br = new BedRoom();
                br.addRoom();
                roomList.addRoom(br);
            } else {
                System.out.println("Error!!!");
            }
        }
            System.out.println("----ROOM LIST----");
            roomList.disPlayAllRooms();
            //delete room by id
            System.out.println("Enter room id to delete: ");
            String deleteId = sc.nextLine();
            boolean deleted = roomList.deleteRoomById(deleteId);
            System.out.println("Deleted result: " + deleted);

            //find room by id
            System.out.println("Enter room id to find: ");
            String findId = sc.nextLine();
            Room findRoom = roomList.findRoomById(findId);
            if (findRoom != null) {
                findRoom.disPlayDetails();
            } else {
                System.out.println("Room not found!");
            }
        }
    }

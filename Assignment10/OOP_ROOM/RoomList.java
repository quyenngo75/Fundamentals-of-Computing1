package Assignment10.OOP_ROOM;

import java.util.*;

public class RoomList {

    ArrayList<Room> roomList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                System.out.println("Update room with id: " + id);
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return roomList.removeIf(r -> r.getId().equals(id));
    }

    public Room findRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    public void disPlayAllRooms() {
        for (Room r : roomList) {
            r.disPlayDetails();
            System.out.println("-------------");
        }
    }

    public Room findMostExpensiveRoom() {
        if(roomList.isEmpty()) return null;
        Room max = roomList.get(0);
        for(Room r : roomList)
        {
            if(r.getBaseCost() > max.getBaseCost())
            {
                max = r;
            }
        }
        return max;
    }

    public void countRooms() {
      roomList.size();
    }
}

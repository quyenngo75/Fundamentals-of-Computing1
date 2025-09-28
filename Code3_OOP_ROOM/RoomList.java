package Code3_OOP_ROOM;

import java.util.*;

public class RoomList {

    ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                return r.updateRoom();
            }
        }
        return false;
    }

    public void disPlayAllRoom() {
        for (Room r : roomList) {
            r.disPlayDetails();
            System.out.println("------------");
        }
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

    public Room findMostExpensiveRoom() {
        if (roomList.isEmpty()) {
            return null;
        }
        Room max = roomList.get(0);
        for (Room r : roomList) {
            if (r.calculateCost() > max.calculateCost()) {
                max = r;
            }
        }
        return max;
    }

    public void countRooms() {
        roomList.size();
    }
}


package Code8_OOP_ROOM;

import java.util.*;

public class RoomList {
    ArrayList<Room> roomList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addRoom(Room room)
    {
        roomList.add(room);
    }
    public boolean updateRoomById(String id)
    {
        for(Room r : roomList)
        {
            if(r.getId().equals(id))
            {
                r.updateRoom();
            }
        }
        return true;
    }
    public boolean deleteRoomById(String id)
    {
        return roomList.removeIf(r->r.getId().equals(id));
    }
    public Room findRoomById(String id)
    {
        for(Room r : roomList)
        {
            if(r.getId().equals(id))
            {
                r.disPlayDetails();
            }
        }
        return null;
    }
    public void disPlayAllRoom()
    {
        for(Room r : roomList)
        {
            r.disPlayDetails();
        }
    }
    public Room findMostExpensiveRoom()
    {
        Room max = roomList.get(0);
        for(Room r : roomList)
        {
            if(max.calculateCost() < r.calculateCost())
            {
                max = r;
            }
        }
        return max;
    }
    public void countRoom()
    {
        int count = 0;
        for(Room r : roomList)
        {
            count ++;
        }
        System.out.println("total room: "+count);
    }
}

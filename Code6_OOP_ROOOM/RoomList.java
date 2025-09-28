
package Code6_OOP_ROOOM;

import java.util.ArrayList;

public class RoomList {
    ArrayList<Room>roomlist=new ArrayList<>();
    public void addroom(Room r){
        roomlist.add(r);
        System.out.println("add completed");
    }
    public void displaydetailsall(){
        for(Room r:roomlist){
            r.displaydetails();
        }
    }
     public Room findMostExpensiveRoom() {
        if (roomlist.isEmpty()) {
            return null;
        }
        Room max = roomlist.get(0);
        for (Room r : roomlist) {
            if (r.calculateCost() > max.calculateCost()) {
                max = r;
            }
        }
        return max;
    }
     public boolean deleteRoomById(String id)
     {
         return roomlist.removeIf(r->r.getId().equals(id));
     }
}

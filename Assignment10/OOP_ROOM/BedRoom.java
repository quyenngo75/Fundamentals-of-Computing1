package Assignment10.OOP_ROOM;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("Enter number of beds: ");
        setNumberOfBeds(Integer.parseInt(sc.nextLine()));   
    }

    @Override
    public void updateRoom() {
    }

    @Override
    public void disPlayDetails() {
        super.disPlayDetails();
        System.out.println("Number of beds: "+getNumberOfBeds());   
    }

    @Override
    public double calculateCost() {
        if (getNumberOfBeds() >=3 ) {
            return getBaseCost() * 0.1;   
        }
        return getBaseCost();
    }
}

package MyWork;
// Composition Example: House has Rooms
class Room{
    String type;
    Room(String type){
        this.type=type;
    }
    public void showRoomDetails() {
        System.out.println("Room Type: "+ type);
    }
}
// House class contains Rooms
class House{
    private Room bedRoom;
    private Room kitchen;
    public House() {
        this.bedRoom = new Room("Bedroom");
        this.kitchen = new Room("Kitchen");
    }
    // Method to display house details
    public void showHouseDetails() {
        System.out.println("House has the following rooms:");
        bedRoom.showRoomDetails();
        kitchen.showRoomDetails();
    }

}

public class CompositionDemo  {
    public static void main(String[] args) {
        House house = new House();
        house.showHouseDetails();
    }
    
}

//Abstract Room class
public class BookMyStayApp {


    public static abstract class Room {
        protected String roomName;
        protected int numberOfBeds;
        protected int squareFeet;
        protected double pricePerNight;

        public Room(String roomName, int beds, int size, double price) {
            this.roomName = roomName;
            this.numberOfBeds = beds;
            this.squareFeet = size;
            this.pricePerNight = price;
        }

        public void displayRoomDetails() {
            System.out.println("Room Type: " + roomName);
            System.out.println("Beds: " + numberOfBeds);
            System.out.println("Size: " + squareFeet + " sq ft");
            System.out.println("Price per Night: $" + pricePerNight);
        }
    }

    // Concrete room classes
    public static class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 1, 200, 100.0);
        }
    }

    public static class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 2, 350, 180.0);
        }
    }

    public static class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Suite Room", 3, 500, 300.0);
        }
    }


    // Main method
    public static void main(String[] args) {

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display room details
        System.out.println("=== Welcome to Book My Stay (Use Case 2) ===\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable + "\n");

        System.out.println("=== Thank you for visiting! ===");
    }
}



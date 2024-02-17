import java.util.ArrayList;
import java.util.List;

class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(List<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    // Constructor
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    // Method to add destination
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    // Method to add passenger
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers. Package is full.");
        }
    }

    // Method to print itinerary
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    // Method to print passenger list
    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    // Method to print available activities
    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > 0) {
                    System.out.println("Destination: " + destination.getName());
                    System.out.println("Activity: " + activity.getName());
                    System.out.println("Spaces Available: " + activity.getCapacity());
                    System.out.println("-------------------------");
                }
            }
        }
    }
}

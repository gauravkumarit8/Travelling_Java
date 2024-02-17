import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Activity snorkeling = new Activity("Snorkeling", "Explore underwater life", 50.0, 10);
        Activity hiking = new Activity("Hiking", "Trekking through nature trails", 30.0, 15);
        Activity sailing = new Activity("Sailing", "Sail around the coast", 100.0, 5);

        // Creating destinations and adding activities
        Destination hawaii = new Destination("Hawaii");
        hawaii.addActivity(snorkeling);
        hawaii.addActivity(hiking);

        Destination bahamas = new Destination("Bahamas");
        bahamas.addActivity(sailing);

        // Creating passengers
        Passenger standardPassenger = new Passenger("John", 1, PassengerType.STANDARD, 200.0);
        Passenger goldPassenger = new Passenger("Alice", 2, PassengerType.GOLD, 300.0);
        Passenger premiumPassenger = new Passenger("Bob", 3, PassengerType.PREMIUM, 0.0);

        // Creating travel package and adding destinations
        TravelPackage package1 = new TravelPackage("Summer Escape", 20);
        package1.addDestination(hawaii);
        package1.addDestination(bahamas);

        // Adding passengers to the travel package
        package1.addPassenger(standardPassenger);
        package1.addPassenger(goldPassenger);
        package1.addPassenger(premiumPassenger);

        // Performing some sign-ups
        standardPassenger.signUp(snorkeling);
        goldPassenger.signUp(sailing);
        premiumPassenger.signUp(hiking);

        // Printing itinerary, passenger list, and available activities
        package1.printItinerary();
        package1.printPassengerList();
        package1.printAvailableActivities();

        //print the passenger details
        System.out.println("Premium Passenger details");
        premiumPassenger.printDetails();
        System.out.println("Gold passender details");
        goldPassenger.printDetails();
        System.out.println("Standard passenger details ");
        standardPassenger.printDetails();

//        Scanner scanner = new Scanner(System.in);
//
//        // Getting activity details from user input
//        System.out.println("Enter snorkeling details (name, description, price, duration):");
//        Activity snorkeling = createActivity(scanner);
//
//        System.out.println("Enter hiking details (name, description, price, duration):");
//        Activity hiking = createActivity(scanner);
//
//        System.out.println("Enter sailing details (name, description, price, duration):");
//        Activity sailing = createActivity(scanner);
//
//        // Creating destinations and adding activities
//        Destination hawaii = new Destination("Hawaii");
//        hawaii.addActivity(snorkeling);
//        hawaii.addActivity(hiking);
//
//        Destination bahamas = new Destination("Bahamas");
//        bahamas.addActivity(sailing);
//
//        // Getting passenger details from user input
//        System.out.println("Enter standard passenger details (name, id, balance):");
//        Passenger standardPassenger = createPassenger(scanner, PassengerType.STANDARD);
//
//        System.out.println("Enter gold passenger details (name, id, balance):");
//        Passenger goldPassenger = createPassenger(scanner, PassengerType.GOLD);
//
//        System.out.println("Enter premium passenger details (name, id, balance):");
//        Passenger premiumPassenger = createPassenger(scanner, PassengerType.PREMIUM);
//
//        // Creating travel package and adding destinations
//        TravelPackage package1 = new TravelPackage("Summer Escape", 20);
//        package1.addDestination(hawaii);
//        package1.addDestination(bahamas);
//
//        // Adding passengers to the travel package
//        package1.addPassenger(standardPassenger);
//        package1.addPassenger(goldPassenger);
//        package1.addPassenger(premiumPassenger);
//
//        // Performing some sign-ups (assuming user would like to sign up for activities)
//        standardPassenger.signUp(snorkeling);
//        goldPassenger.signUp(sailing);
//        premiumPassenger.signUp(hiking);
//
//        // Printing itinerary, passenger list, and available activities
//        package1.printItinerary();
//        package1.printPassengerList();
//        package1.printAvailableActivities();
//
//        // Print passenger details
//        System.out.println("Premium Passenger details:");
//        premiumPassenger.printDetails();
//        System.out.println("Gold Passenger details:");
//        goldPassenger.printDetails();
//        System.out.println("Standard Passenger details:");
//        standardPassenger.printDetails();
//
//        scanner.close(); // Closing scanner to prevent resource leak
//    }
//    private static Activity createActivity(Scanner scanner) {
//        String name = scanner.next();
//        String description = scanner.next();
//        int price = scanner.nextInt();
//        int duration = scanner.nextInt();
//        return new Activity(name, description, price, duration);
//    }
//
//    // Helper method to create passenger from user input
//    private static Passenger createPassenger(Scanner scanner, PassengerType type) {
//        String name = scanner.next();
//        int id = scanner.nextInt();
//        double balance = scanner.nextDouble();
//        return new Passenger(name, id, type, balance);
   }
}
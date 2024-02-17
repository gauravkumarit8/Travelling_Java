import java.util.ArrayList;
import java.util.List;
public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private double balance;
    private List<Activity> activities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    // Constructor
    public Passenger(String name, int passengerNumber, PassengerType passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    // Method to sign up for an activity
    public void signUp(Activity activity) {
        if (activity.getCapacity() > 0) {
            if (passengerType == PassengerType.STANDARD) {
                if (balance >= activity.getCost()) {
                    balance -= activity.getCost();
                    activities.add(activity);
                    activity.capacity--;
                } else {
                    System.out.println("Insufficient balance for activity: " + activity.getName());
                }
            } else if (passengerType == PassengerType.GOLD) {
                double discountedCost = activity.getCost() * 0.9;
                if (balance >= discountedCost) {
                    balance -= discountedCost;
                    activities.add(activity);
                    activity.capacity--;
                } else {
                    System.out.println("Insufficient balance for activity: " + activity.getName());
                }
            } else {
                activities.add(activity);
                activity.capacity--;
            }
        } else {
            System.out.println("Activity " + activity.getName() + " is full.");
        }
    }

    // Method to print passenger details
    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        if (passengerType == PassengerType.STANDARD || passengerType == PassengerType.GOLD) {
            System.out.println("Balance: " + balance);
        }
        System.out.println("Activities Signed Up For:");
        for (Activity activity : activities) {
            System.out.println("Name: " + activity.getName());
            System.out.println("Description: " + activity.getDescription());
            System.out.println("Cost: " + activity.getCost());
            System.out.println("-------------------------");
        }
    }


}

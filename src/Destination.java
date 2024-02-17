import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    // Constructor
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    // Method to add activity
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Method to print activities
    public void printActivities() {
        System.out.println("Activities at " + name + ":");
        for (Activity activity : activities) {
            System.out.println("Name: " + activity.getName());
            System.out.println("Description: " + activity.getDescription());
            System.out.println("Cost: " + activity.getCost());
            System.out.println("Capacity: " + activity.getCapacity());
            System.out.println("-------------------------");
        }
    }
}

import java.util.*;

/**
 * Can add extracurricular activities to Student
 */
public class ExtraCurricular {
    private static String[] activities = {"Art club", "Book club", "School varsity", "School newspaper"};

    /**
     * Adds a list of extracurricular activities the Student selected
     * @return an ArrayList of type String of extracurricular activities.
     */
    public static ArrayList<String> addExtraCurricular() {
        Scanner stdin = new Scanner(System.in);
        ArrayList<String> selectedActivities = new ArrayList<>();

        System.out.println("Available activities: ");
        for(String activity : activities) {
            System.out.println(activity);
        }

        System.out.println("Type the activity you would like to join: ");

        while(true) {
            System.out.print("Activity (Press enter to exit): ");
            String select = stdin.nextLine();
            if(select.equals(""))
                break;
            selectedActivities.add(select);
        }

        return selectedActivities;
    }
}

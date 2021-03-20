import java.util.*;

public class ExtraCurricular {
    private String[] activities = {
      "Art club", "Book club", "Soccer team", "School Newspaper"
    };
    private ArrayList<String> selectedActivities = new ArrayList<String>();

    private Scanner stdin = new Scanner(System.in);

    public ExtraCurricular() {
        System.out.println("Available activities: ");
        for(String activity : activities) {
            System.out.println(activity);
        }
        System.out.println("Select the ones you would like to join (Enter nothing to exit): ");
        while(true) {
            System.out.print("Activity: ");
            String select = stdin.nextLine();
            if(select.equals(""))
                break;
            selectedActivities.add(select);
        }
    }

    public ArrayList<String> getSelectedActivities() {
        return selectedActivities;
    }
}

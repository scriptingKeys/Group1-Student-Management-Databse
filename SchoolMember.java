import java.util.ArrayList;

/**
 * Represents a school member
 */
public abstract class SchoolMember {
    private ArrayList<String> classes = new ArrayList<>();

    /**
     * Gets the the courses.
     * @return an ArrayList of type String with the list of classes.
     */
    public ArrayList<String> getCourses() {
        return classes;
    }

    public abstract String getName();
    public abstract String getEmail();
    public abstract String getAddress();
    public abstract long getPhoneNum();
}

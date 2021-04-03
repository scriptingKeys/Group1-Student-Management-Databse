import java.util.*;

/**
 * Represents a school member
 */
public interface SchoolMember {

    /**
     * Gets the the courses.
     * @return an ArrayList of type String with the list of classes.
     */
    ArrayList<String> getCourses();

    /**
     * Gets the name of a school member.
     * @return Name of a school member.
     */
    String getName();

    /**
     * Gets the email of a school member.
     * @return Email of a school member.
     */
    String getEmail();

    /**
     * Gets the address a school member.
     * @return Address of a school member.
     */
    String getAddress();

    /**
     * Gets the phone of a school member.
     * @return Phone number.
     */
    long getPhoneNum();
}

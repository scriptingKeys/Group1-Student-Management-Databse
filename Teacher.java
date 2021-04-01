import java.util.*;

/**
 * Represents a Teacher.
 */
public class Teacher implements SchoolMember {
    protected String name, email, address;
    protected long phoneNum;
    private ArrayList<String> classesTeaching = new ArrayList<>();
    private static int numberOfTeachers;

    /**
     * Initializes the necessary information the name, address, email, and phone number.
     */
    public Teacher() {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter teacher's first name + last name: ");
        name = stdin.nextLine();

        System.out.print("Enter teacher's address: ");
        address = stdin.nextLine();

        System.out.print("Enter teacher's email: ");
        email = stdin.next();

        System.out.print("Enter teacher's phone number: ");
        phoneNum = stdin.nextLong();

        ++numberOfTeachers;
    }

    /**
     * Adds the ability to remove a class.
     */
    public void remove() {
        classesTeaching = AddRemove.removeCourse(this);
    }

    /**
     * Adds the ability to add a class.
     */
    public void add() {
        classesTeaching = AddRemove.addCourse(this);
    }

    /**
     * String representation of the class.
     * @return Teacher information.
     */
    public String toString() {
        return this.getClass().getName() + "[" + name + "," + address + ", " + email + ", " + phoneNum + "]";
    }

    /**
     * Gets the list of courses taught by the teacher.
     * @return An ArrayList of the courses taught.
     */
    @Override
    public ArrayList<String> getCourses() {
        return classesTeaching;
    }

    /**
     * Gets the name of the teacher.
     * @return Name of the teacher.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the email of the teacher.
     * @return Email of the teacher.
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Gets the address of the teacher.
     * @return Address of the teacher.
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the teacher.
     * @return Phone number of the teacher.
     */
    @Override
    public long getPhoneNum() {
        return phoneNum;
    }

    /**
     * Gets the number of teachers.
     * @return Number of teachers.
     */
    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }
}

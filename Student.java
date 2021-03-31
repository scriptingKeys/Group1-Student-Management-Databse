import java.util.*;

/**
 * Represents a Student
 */
public class Student extends SchoolMember {

    private String name, email, address;
    private int dayofB, monthofB, yearofB;
    private long phoneNum;
    private int year;
    private ArrayList<String> classesTaking = new ArrayList<>();

    /**
     * A number unique for each student instance.
     */
    private long studentID;
    /**
     * Is the counter to determine the studentID
     */
    private static long studentNumber = 1000000000;

    private static int numberOfStudents;

    /**
     * Initializes the necessary information of a student. Asks the name, address, email, DOB, phone number, and year of study.
     * Calls the static method addExtraCurricular from the ExtraCurricular class if the student wants to add extracurricular activities.
     * Calls the setClasses() and setStudentID() respectively.
     */
    public Student() {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter student's first name + last name: ");
        name = stdin.nextLine();

        System.out.print("Enter student's address: ");
        address = stdin.nextLine();

        System.out.print("Enter student's email: ");
        email = stdin.next();

        System.out.print("Enter student's day of birth (DD): ");
        dayofB = stdin.nextInt();

        System.out.print("Enter student's month of birth (MM): ");
        monthofB = stdin.nextInt();

        System.out.print("Enter student's year of birth: (YYYY)");
        yearofB = stdin.nextInt();

        System.out.print("Enter student's phone number: ");
        phoneNum = stdin.nextLong();

        System.out.print("Enter student's year of study: ");
        year = stdin.nextInt();

        System.out.print("Would you like to participate in extracurricular activities? (y/n): ");
        if (stdin.next().equals("y")) {
            classesTaking.addAll(ExtraCurricular.addExtraCurricular());
        }

        ++numberOfStudents;

        setClasses();
        setStudentID();
    }

    /**
     * Initially populates the student's courses based on the year level. Called inside the Student constructor only.
     */
    private void setClasses() {
        Scanner stdin = new Scanner(System.in);
        System.out.print("How many courses do you want to take: ");
        int take = stdin.nextInt();
        int count = 0;
        String course;

        if (year == 1) {
            while (count < take) {
                System.out.println("The following first year courses are available: COMP120, COMP125, COMP150, CMNS152, COMP155");
                course = stdin.next();
                stdin.nextLine();
                classesTaking.add(course);
                count++;
            }
        }
        if (year == 2) {
            while (count < take) {
                System.out.println("The following second year courses are available: CMNS230, COMP251, COMP256");
                course = stdin.next();
                stdin.nextLine();
                classesTaking.add(course);
                count++;
            }
        }
        if (year == 3) {
            while (count < take) {
                System.out.println("The following third year courses are available: COMP310, COMP320, MATH331, COMP354");
                course = stdin.next();
                stdin.nextLine();
                classesTaking.add(course);
                count++;
            }
        }
        if (year == 4) {
            while (count < take) {
                System.out.println("The following fourth year courses are available: COMP420, COMP430, COMP450, COMP454");
                course = stdin.next();
                stdin.nextLine();
                classesTaking.add(course);
                count++;
            }
        }
    }

    /**
     *
     */
    public void remove() {
        classesTaking = AddRemove.removeCourse(this);
    }

    /**
     *
     */
    public void add() {
        classesTaking = AddRemove.addCourse(this);
    }

    /**
     * Adds one to the static studentNumber field and stores it to the studentID field.
     */
    private void setStudentID() {
        studentID = ++studentNumber;
    }

    /**
     * Gets the ArrayList of the student's courses.
     * @return Student's courses.
     */
    public ArrayList<String> getCourses() {
        return classesTaking;
    }

    /**
     * Gets the name of the student.
     * @return Name of student.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address of the student.
     * @return Address of student.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the email of the student.
     * @return Email of the student.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the phone number of the student.
     * @return Phone number of student.
     */
    public long getPhoneNum() {
        return phoneNum;
    }

    /**
     * Gets the Date of birth of the student.
     * @return Date of birth of the student.
     */
    public String getStudentDOB() {
        return dayofB + monthofB + yearofB + "";
    }

    /**
     * Gets the Student ID.
     * @return The unique ID assigned to each Student instance.
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * Gets the number of students.
     * @return The number of students.
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * Student class toString method override.
     * @return Student information.
     */
    public String toString() {
        return this.getClass().getName() + "[" + name + "," + address + ", " + email + ", " + phoneNum + ", " + dayofB +  ", " + monthofB + ", " + yearofB +
                ", " + year + ", " + studentID + "]";
    }
}





import java.util.*;
public class Student {
    Scanner stdin = new Scanner(System.in);

    // Instance variables go here: students ID number, Name, Address, Phone number, email

    private String name, email, address;
    private int DayofB, MonthofB, YearofB;
    private long phoneNum;
    private int year;
    private ArrayList<String> classes = new ArrayList<>();

    private long studentID;
    private static long studentNumber = 30000;

    public Student() {
        Scanner stdin = new Scanner(System.in);
        /*System.out.println("Enter student ID:");
        studentID = stdin.nextLong();

        System.out.print("Enter student first name + last name:  ");
        name = stdin.nextLine();
        stdin.nextLine();

        System.out.print("Enter student day of birth: ");
        DayofB = stdin.nextInt();

        System.out.print("Enter student month of birth: ");
        MonthofB = stdin.nextInt();

        System.out.print("Enter student year of birth: ");
        YearofB = stdin.nextInt();

        System.out.print("Enter Student's Address: ");
        address = stdin.next();

        System.out.print("Enter student's phone number: ");
        phoneNum = stdin.nextLong();

        System.out.print("Enter student's email: ");
        email = stdin.next();

        */

        System.out.print("Enter student's year of study:");
        year = stdin.nextInt();

        System.out.print("Would you like to participate in extracurricular activities? (y/n). (Press enter to exit): ");
        String x = stdin.next();
        if (x.equals("y")) {
            classes.addAll(new ExtraCurricular().getSelectedActivities());
        }

        setClasses();

        setStudentID();
    }

    private void setStudentID() {
        studentNumber++;
        studentID = studentNumber;
    }

    public long getStudentID() {
        return studentID;
    }


    private void setClasses() {
        System.out.println("How many courses do you want to take");
        int take = stdin.nextInt();
        int count = 0;
        String course;

        if (year == 1) {
            while (count < take) {
                System.out.println("The following first year courses are available: COMP120, COMP125, COMP150, CMNS152, COMP155");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 2) {
            while (count < take) {
                System.out.println("The following second year courses are available: CMNS230, COMP251, COMP256");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 3) {
            while (count < take) {
                System.out.println("The following third year courses are available: COMP310, COMP320, MATH331, COMP354");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 4) {
            while (count < take) {
                System.out.println("The following fourth year courses are available: COMP420, COMP430, COMP450, COMP454");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
    }

    public void remove() {
        classes = new AddRemove(this).removeCourse();
    }

    public void add() {
        classes = new AddRemove(this).addCourse();
    }

    public String getName() {
        return name;
    }

    public String getStudentDOB() {
        return "DOB format: MMDDYYYY\n" + MonthofB + " " + DayofB + " " + YearofB;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phoneNum;
    }

    public String email() {
        return email;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }
}





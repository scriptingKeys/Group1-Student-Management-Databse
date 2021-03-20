import java.util.*;
public class Student {
    Scanner stdin = new Scanner(System.in);

    // Instance variables go here: students ID number, Name, Address, Phone number, email

    private String name;
    private long studentID;
    private int DayofB, MonthofB, YearofB;
    private String Address;
    private long phoneNum;
    private String email;
    private int year;
    private ArrayList<String> classes = new ArrayList<>();

    //Constructor

    public Student() {
        Scanner stdin = new Scanner(System.in);
        /*System.out.println("Enter student ID:");
        studentID = stdin.nextLong();


        System.out.println("Enter student first name + last name:  ");
        name = stdin.nextLine();
        stdin.nextLine();*/

        System.out.print("Enter student's year of study:");
        year = stdin.nextInt();

        /*System.out.println("Enter student day of birth:");
        DayofB = stdin.nextInt();

        System.out.println("Enter student month of birth:");
        MonthofB = stdin.nextInt();

        System.out.println("Enter student year of birth");
        YearofB = stdin.nextInt();

        System.out.println("Enter Student's Address:");
        Adress = stdin.next();


        System.out.println("Enter student's phone number:");
        phoneNum = stdin.nextLong();

        System.out.println("Enter student's email");
        email = stdin.next();*/

        System.out.print("Would you like to participate in extracurricular activities? (y/n. Enter nothing to exit): ");
        String x = stdin.next();
        if (x.equals("y")) {
            classes.addAll(new ExtraCurricular().getSelectedActivities());
        }
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Get methods

    public String getName() {
        return name;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getStudentDOB() {
        return "DOB format: MMDDYYYY\n" + MonthofB + " " + DayofB + " " + YearofB;
    }

    public String getAddress() {
        return Address;
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

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setClasses() {
        System.out.println("How many courses do you want to take");
        int take = stdin.nextInt();
        int count = 0;
        String course;

        if (year == 1) {
            while (count < take) {
                System.out.println("The following first year courses are available: COMP 120, COMP 125, COMP 150, CMNS 152, COMP 155");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 2) {
            while (count < take) {
                System.out.println("The following second year courses are available: CMNS 230, COMP 251, COMP 256");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 3) {
            while (count < take) {
                System.out.println("The following third year courses are available: COMP 310, COMP 320, MATH 331, COMP 354");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
        if (year == 4) {
            while (count < take) {
                System.out.println("The following fourth year courses are available: COMP 420, COMP 430, COMP 450, COMP 454");
                course = stdin.next();
                stdin.nextLine();
                classes.add(course);
                count++;
            }
        }
    }

    public void remove() {
        AddRemove addRemove = new AddRemove(this);
        addRemove.removeCourse();
    }

    public void add() {
        AddRemove addRemove = new AddRemove(this);
        addRemove.removeCourse();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////





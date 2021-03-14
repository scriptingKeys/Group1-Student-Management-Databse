import java.util.*;
public class Student{

    // Instance variables go here: students ID number, Name, Address, Phone number, email

    private long studentID;
    private int DayofB,MonthofB,YearofB;
    private String Adress;
    private long phoneNum;
    private String email;
    private int year;
    //private String[] classArray = {};
    private ArrayList<String> classes = new ArrayList<>();

    private String name;
    Scanner stdin = new Scanner(System.in);
    private String course;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Student(){
        Scanner stdin =new Scanner(System.in);
        System.out.println ("Enter student ID:");
        studentID = stdin.nextLong();
        stdin.nextLine();

        System.out.println ("Enter student first name + last name:  ");
        name = stdin.nextLine();

        System.out.println ("Enter student's year of study:");
        year = stdin.nextInt();

        System.out.println ("Enter student day of birth:");
        DayofB = stdin.nextInt();

        System.out.println("Enter student month of birth:");
        MonthofB = stdin.nextInt();

        System.out.println("Enter student year of birth");
        YearofB = stdin.nextInt();

        System.out.println ("Enter Student's Address:");
        Adress = stdin.nextLine();
        stdin.nextLine();

        System.out.println ("Enter student's phone number:");
        phoneNum = stdin.nextLong();

        System.out.println ("Enter student's email");
        email = stdin.nextLine();
        stdin.nextLine();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Set methods

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
        return Adress;
    }
    public long getPhone() {
        return phoneNum;
    }
    public String email() {
        return email;
    }

    public ArrayList<String>getClasses(){
       return classes;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setClasses(){
        System.out.println("How many courses do you wnt to take");
        int take = stdin.nextInt();
        int count = 0;

        if (year == 1){
            for(; count < take; count++) {
                System.out.println("The following first year courses are available: COMP 120, COMP 125, COMP 150, CMNS 152, COMP 155");
                course = stdin.next();
                classes.add(course);
            }
        }
        if (year == 2){
            while(count < take) {
                System.out.println("The following second year courses are available: CMNS 230, COMP 251, COMP 256");
                course = stdin.next();
                classes.add(course);
                count++;
            }
        }
        if (year == 3){
            while(count < take) {
                System.out.println("The following third year courses are available: COMP 310, COMP 320, MATH 331, COMP 354");
                course = stdin.next();
                classes.add(course);
                count++;
            }
        }
        if (year == 4){
            while(count < take) {
                System.out.println("The following fourth year courses are available: COMP 420, COMP 430, COMP 450, COMP 454");
                course = stdin.next();
                classes.add(course);
                count++;
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////
    // Main function
    public static void main(String[] args){

        // input
        Scanner in = new Scanner(System.in);

        // Create an instance of the student class
        Student student1 = new Student();
    }
}

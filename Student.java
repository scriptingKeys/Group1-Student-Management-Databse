import java.util.Scanner;

public class Student {
    private String name;

    private long studentID;
    private int DayofB,MonthofB,YearofB;
    private String Adress;
    private long phoneNum;
    private String email;
    // Student Constructor
    public Student() {
        Scanner stdin =new Scanner(System.in);
        System.out.println ("Enter student ID:");
        this.studentID = stdin.nextLong();
        System.out.println ("Enter student first name + last name:  ");
        this.name = stdin.nextLine();

        System.out.println ("Enter student day of birth:");
        this.DayofB = stdin.nextInt();
        System.out.println("Enter student month of birth:");
        this.MonthofB = stdin.nextInt();
        System.out.println("Enter student year of birth");
        this.YearofB = stdin.nextInt();
        System.out.println ("Enter Student's Address:");
        this.Adress = stdin.nextLine();
        System.out.println ("Enter student's phone number:");
        this.phoneNum = stdin.nextLong();
        System.out.println ("Enter student's email");
        this.email = stdin.nextLine();
    }
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
}
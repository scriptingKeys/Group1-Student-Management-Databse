import java.util.*;
public class Student{

    // Instance variables go here: students ID number, Name, Address, Phone number, email

    private long studentID;
    private int DayofB,MonthofB,YearofB;
    private String Adress;
    private long phoneNum;
    private String email;
    private int year;
    private ArrayList<String> classes = new ArrayList<>();
    private ArrayList<String> extra = new ArrayList<>();

    private String name;
    Scanner stdin = new Scanner(System.in);
    private String course;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Student(){
        Scanner stdin =new Scanner(System.in);
        System.out.println ("Enter student ID:");
        studentID = stdin.nextLong();
        

        System.out.println ("Enter student first name + last name:  ");
        name = stdin.nextLine();
        stdin.nextline();
        
        System.out.println ("Enter student's year of study:");
        year = stdin.nextInt();

        System.out.println ("Enter student day of birth:");
        DayofB = stdin.nextInt();

        System.out.println("Enter student month of birth:");
        MonthofB = stdin.nextInt();

        System.out.println("Enter student year of birth");
        YearofB = stdin.nextInt();

        System.out.println ("Enter Student's Address:");
        Adress = stdin.next();
        

        System.out.println ("Enter student's phone number:");
        phoneNum = stdin.nextLong();

        System.out.println ("Enter student's email");
        email = stdin.next();
        
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

    public void getClasses(){
       System.out.println(classes);
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setClasses(){
        System.out.println("How many courses do you wnt to take");
        int take = stdin.nextInt();
        int count = 0;

        if (year == 1){
            while(count < take) {
                System.out.println("The following first year courses are available: COMP 120, COMP 125, COMP 150, CMNS 152, COMP 155");
                course = stdin.next();
                classes.add(course);
                count++;
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

    public void addCourse(){
        
        System.out.println("Would you like to add a course? y/n");
            String ans = stdin.next();
                while (ans.equals("y")){
                    System.out.println ("Enter the class you want to add!");
                    classes.add(stdin.next());
                    System.out.println("Would you still like to add a course? y/n");
                    ans = stdin.next();
            }
        
    }
    public void removeCourse(){
        System.out.println("would you like to remove a course? y/n");
        ans = stdin.next();
        
        if (ans.equals("y")  && classes.size() != 0  ){

           while (ans.equals("y")){
            System.out.println("Current courses: " + classes + "\n Pick a course you would ike to remove (Starting at index 0)");
            classes.remove(std.nextInt());
            System.out.println("would you like to remove another class?");
            ans = stdin.nextLine();
           }
        
        else{break;}   

        }
        else{System.out.println("You have no courses to remove!"); break;}
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
public 
/////////////////////////////////////////////////////////////////////////////////////////////////
    // Main function
    public static void main(String[] args){

        // input
        Scanner in = new Scanner(System.in);

        // Create an instance of the student class
        Student student1 = new Student();
    }
}




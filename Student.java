import java.util.*;
public class Student extends SchoolMember {
    Scanner stdin = new Scanner(System.in);

    private String name, email, address;
    private int dayofB, yearofB;
    private String monthofB;
    private long phoneNum;
    private int year;
    private ArrayList<String> classes = new ArrayList<>();

    private long studentID;
    private static long studentNumber = 1000000000;

    public Student() {
        Scanner stdin = new Scanner(System.in);

        /*
        System.out.print("Enter student's first name + last name: ");
        name = stdin.nextLine();

        System.out.print("Enter student's address: ");
        address = stdin.nextLine();

        System.out.print("Enter student's email: ");
        email = stdin.next();

        System.out.print("Enter student's month of birth: ");
        monthofB = stdin.next();

        System.out.print("Enter student's day of birth: ");
        dayofB = stdin.nextInt();

        System.out.print("Enter student's year of birth: ");
        yearofB = stdin.nextInt();

        System.out.print("Enter student's phone number: ");
        phoneNum = stdin.nextLong();

        */

        System.out.print("Enter student's year of study: ");
        year = stdin.nextInt();

        System.out.print("Would you like to participate in extracurricular activities? (y/n): ");
        if (stdin.next().equals("y")) {
            classes.addAll(ExtraCurricular.addExtraCurricular(this));
        }

        setClasses();
        setStudentID();
    }


    private void setClasses() {
        System.out.print("How many courses do you want to take: ");
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


    /*public void addClass() {
        classes = AddRemove.addCourse(this);
    }

    public void removeClass() {
        classes = AddRemove.removeCourse(this);
    }

     */

    private void setStudentID() {
        studentNumber++;
        studentID = studentNumber;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public String getStudentDOB() {
        return monthofB + " " + dayofB + " " + yearofB;
    }

    public long getStudentID() {
        return studentID;
    }

    public String toString() {
        /*return "Name: " + name +
                "\nAddress: " + address +
                "\nEmail: " + email +
                "\nPhone: " + phoneNum +
                "\nDOB: " + monthofB + " " +  dayofB + " " + yearofB +
                "\nYear: " + year +
                "\nStudent ID: " + studentID +
                "\nClasses: " + classes;

         */

        return this.getClass().getName() + "[" + name + "," + address + ", " + email + ", " + phoneNum + ", " + monthofB +  ", " + dayofB + ", " + yearofB +
                ", " + year + ", " + studentID + "]";
    }
}





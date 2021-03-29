import java.util.*;

public class Teacher extends SchoolMember {
    private String name, email, address;
    private long phoneNum;
    private ArrayList<String> classes = new ArrayList<>();

    public Teacher() {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter teacher's first name + last name: ");
        name = stdin.nextLine();

        System.out.print("Enter teacher's address: ");
        email = stdin.nextLine();

        System.out.print("Enter teacher's email: ");
        email = stdin.next();

        System.out.print("Enter teacher's phone number: ");
        phoneNum = stdin.nextLong();
    }

    public String toString() {
        /*return "Name: " + name +
                "\nAddress: " + address +
                "\nEmail: " + email +
                "\nPhone: " + phoneNum +
         */

        return this.getClass().getName() + "[" + name + "," + address + ", " + email + ", " + phoneNum + "]";
    }

    @Override
    public ArrayList<String> getClasses() {
        return classes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public long getPhoneNum() {
        return phoneNum;
    }
}

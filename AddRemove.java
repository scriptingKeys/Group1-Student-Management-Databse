import java.util.*;

public class AddRemove {
    private Scanner stdin = new Scanner(System.in);
    private Student student;
    private ArrayList<String> courses;

    public AddRemove(Student student){
        this.student = student;
        courses = this.student.getClasses();
    }

    public void printClasses() {
        System.out.println(courses);
    }

    public void addCourse() {
        System.out.print("Would you like to add a course? (y/n): ");
        String ans = stdin.next();
        while (ans.equals("y")){
            System.out.print("Enter the class you want to add: ");
            courses.add(stdin.next());
            System.out.print("Would you still like to add a course? (y/n): ");
            ans = stdin.next();
        }
    }

    public void removeCourse(){
        System.out.print("would you like to remove a course? (y/n): ");
        String ans = stdin.next();

        if (ans.equals("y")  && courses.size() != 0 ){
            while (ans.equals("y")){
                System.out.println("Current courses: " + courses);
                System.out.print("Pick a course you would ike to remove (Starting at index 0): ");
                courses.remove(stdin.next());
                System.out.print("Would you like to remove another class? (y/n): ");
                ans = stdin.next();
            }
        }
        else{System.out.println("You have no courses to remove!");}
    }
}

import java.util.*;

public class AddRemove {
    private static Scanner stdin = new Scanner(System.in);

    public static ArrayList<String> addCourse(SchoolMember s) {
        ArrayList<String> courses = s.getClasses();

        String ans;
        do {
            System.out.print("Enter course you would like to add: ");
            courses.add(stdin.next());
            System.out.print("Would you still like to add a course? (y/n): ");
            ans = stdin.next();
            if(ans.equals("n"))
                break;
        } while(ans.equals("y"));

        return courses;
    }

    public static ArrayList<String> removeCourse(SchoolMember s){
        ArrayList<String> courses = s.getClasses();

        String ans;
        do {
            System.out.print("Enter course you would like to remove: ");
            courses.remove(stdin.nextInt());
            System.out.println("Would you still like to remove a course? (y/n)");
            ans = stdin.next();
            if(ans.equals("n"))
                break;
        } while(ans.equals("y"));

        return courses;
    }
}

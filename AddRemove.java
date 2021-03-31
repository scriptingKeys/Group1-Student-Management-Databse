import java.util.*;

/**
 * Adds the ability to add and remove classes from a student or teacher's list of courses.
 */
public class AddRemove {
    private static Scanner stdin = new Scanner(System.in);

    /**
     * Adds a class to a SchoolMember's list of classes.
     * @param member Accepts a SchoolMember to add courses to.
     * @return An updated ArrayList of courses with the added course.
     */
    public static ArrayList<String> addCourse(SchoolMember member) {
        ArrayList<String> courses = member.getCourses();

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

    /**
     * Removes a class to a SchoolMember's list of classes.
     * @param member Accepts a SchoolMember to remove a course from.
     * @return An updated ArrayList of courses with the removed course.
     */
    public static ArrayList<String> removeCourse(SchoolMember member){
        ArrayList<String> courses = member.getCourses();

        String ans;
        do {
            System.out.print("Enter course you would like to remove (Staring from index 0): ");
            courses.remove(stdin.nextInt());
            System.out.println("Would you still like to remove a course? (y/n)");
            ans = stdin.next();
            if(ans.equals("n"))
                break;
        } while(ans.equals("y"));

        return courses;
    }
}

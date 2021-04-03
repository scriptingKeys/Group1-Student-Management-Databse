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
        try {
            Student student = (Student) member;
            String[][] availableCourses = student.getCoursesAvailable();
            int year = student.getYear();
            System.out.print("Available courses: ");
            for(int i = 0 ; i < availableCourses[year-1].length; i++) {
                System.out.print(availableCourses[year-1][i] + " ");
            }
            System.out.println();
        }
        catch(ClassCastException ignored) { }

        String ans;
        do {
            System.out.print("Type the name of the course you would like to add: ");
            courses.add(stdin.next());
            System.out.print("Would you like to add another course? (y/n): ");
            ans = stdin.next();
            if(ans.equals("n")) {
                System.out.println("\nCourses updated");
                break;
            }
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
            System.out.println("Courses you are taking: " + courses);
            System.out.print("Enter course you would like to remove (Staring at index 0): ");
            courses.remove(stdin.nextInt());
            System.out.print("Would you like to remove another course? (y/n): ");
            ans = stdin.next();
            if(ans.equals("n")) {
                System.out.println("\nCourse updated");
                break;
            }
        } while(ans.equals("y"));

        return courses;
    }
}

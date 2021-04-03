import java.util.*;

/**
 * Represents a computer teacher.
 */
public class CompTeacher extends Teacher {
    private ArrayList<String> languages  = new ArrayList<>();
    private ArrayList<String> teaching = new ArrayList<>();
    private Scanner stdin = new Scanner(System.in);

    private int age;
    private String degree;

    /**
     * Initializes the age and degree. Calls the setLang() and setClasses() methods.
     */
    public CompTeacher(){
        System.out.print("Enter teacher's age: ");
        age = stdin.nextInt();
        stdin.nextLine();

        System.out.print("Enter teacher's qualification: ");
        degree = stdin.nextLine();

        setLang();
        setClasses();

        System.out.println("\nTeacher created");
    }

    /**
     * Populates the teaching ArrayList.
     */
    private void setLang() {

        System.out.print("Would you like to add a coding Language? (y/n): ");
        String count = stdin.next();
        if (count.equals("y"))
        {
            while(true) {
                System.out.print("Please type a programming language you know: ");
                languages.add(stdin.next());
                System.out.print("Would you like to add another programming language? (y/n): ");
                if(stdin.next().equals("n")) break;
            }
        }
    }

    /**
     * Populates the languages ArrayList.
     */
    private void setClasses(){

        System.out.print("Would you like to add a course? (y/n): ");
        String cont = stdin.next();
        if (cont.equals("y")) {
            while(true) {
                System.out.print("Enter the name of course you are teaching: ");
                stdin.nextLine();
                teaching.add(stdin.nextLine());
                System.out.print("Would you like to add another course? (y/n): ");
                if(stdin.next().equals("n")) break;
            }
        }
    }

    /**
     * Gets the ArrayList of languages the teacher knows.
     * @return ArrayList of languages
     */
    public ArrayList<String> getLang(){
        return languages;
    }

    /**
     **Gets the ArrayList of classes the teacher is teaching.
     * @return ArrayList of classes.
     */
    @Override
    public ArrayList<String> getCourses() {
        return teaching;
    }

    /**
     * String representation of the class.
     * @return CompTeacher information.
     */
    public String toString(){
        return this.getClass().getName() + "[" + name + ", " + address + ", " + email + ", Degree: " + degree + ", Classes Teaching: " + teaching + ", Languages: " + languages + "]";
    }
}
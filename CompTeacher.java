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
        System.out.println("Enter teacher's age: ");
        age = stdin.nextInt();

        System.out.println("Enter teacher's qualification: ");
        degree = stdin.next();

        setLang();
        setClasses();
    }

    /**
     * Populates the teaching ArrayList.
     */
    private void setLang() {

        System.out.print("Would you like to add a coding Language? (y/n): ");
        String count = stdin.next();
        if (count.equals("y"))
        {
            System.out.println("Please input languages known");
            languages.add(stdin.next());
            System.out.println("Would you like to add another known language? (y/n)");
            count = stdin.next();
        }
    }

    /**
     * Populates the languages ArrayList.
     */
    private void setClasses(){

        System.out.println("Would you like to add a course? (y/n)");
        String cont = stdin.next();
        if (cont.equals("y")){
            System.out.println("Enter a class you are teaching");
            stdin.nextLine();
            teaching.add(stdin.nextLine());
            System.out.println("Would you like to add another course? (y/n)");
            cont = stdin.next();
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
        return this.getClass().getName() + "[" + name + "," + address + ", " + email + ", Degree: " + degree + ", Classes Teaching: " + teaching + ", Languages: " + languages + "]";
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        ArrayList<Student> listOfStudents = new ArrayList<>();
        ArrayList<Teacher> listOfTeachers = new ArrayList<>();

        while(true) {
            System.out.println();
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("|         UFV Database        |");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("|         System Menu         |");
            System.out.println("+ 1) Add a new student        +");
            System.out.println("| 2) Add a new teacher        |");
            System.out.println("+ 3) List of students         +");
            System.out.println("| 4) List of teachers         |");
            System.out.println("+ 5) Edit a student's classes +");
            System.out.println("| 6) Edit a teacher's classes |");
            System.out.println("+ 0) Exit                     +");
            System.out.println("|+-+-+-+-+-+-+-+-+-+-+-+-+-+-+|");

            System.out.print("> ");

            int command = -1;
            try {
                command = stdin.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.print("\nPlease input an integer");
            }
            stdin.nextLine();
            System.out.println();
            if(command == 0) break;
            else if(command == 1) {
                listOfStudents.add(new Student());
            }
            else if(command == 2) {
                listOfTeachers.add(new CompTeacher());
            }
            else if(command == 3) {
                if(listOfStudents.isEmpty()) {
                    System.out.println("No students to show");
                    continue;
                }
                for(Student student : listOfStudents) {
                    System.out.println(student.toString());
                }
            }
            else if(command == 4) {
                if(listOfTeachers.isEmpty()) {
                    System.out.println("No teachers to show");
                    continue;
                }
                for(Teacher teacher : listOfTeachers) {
                    System.out.println(teacher.toString());
                }
            }
            else if(command == 5) {
                if(listOfStudents.isEmpty()) {
                    System.out.println("No students to edit");
                    continue;
                }
                System.out.print("What is the name the student you would like to edit: ");
                String name = stdin.nextLine();
                for(int i = 0; i < listOfStudents.size(); i++) {
                    Student students = listOfStudents.get(i);
                    if(students.getName().equalsIgnoreCase(name)) {
                        System.out.print("Would you like to add or remove a class? (a/r): ");
                        String edit = stdin.next();
                        if(edit.equals("a")) {
                            students.add();
                        }
                        else if(edit.equals("r")) {
                            students.remove();
                        }
                    }
                    else {
                        System.out.println("Could not find student named " + name);
                    }
                }
            }
            else if(command == 6) {
                if(listOfTeachers.isEmpty()) {
                    System.out.println("No teachers to edit");
                    continue;
                }
                System.out.print("What is the name the teacher you would like to edit: ");
                String name = stdin.nextLine();
                for(int i = 0; i < listOfTeachers.size(); i++) {
                    Teacher teachers = listOfTeachers.get(i);
                    if(teachers.getName().equalsIgnoreCase(name)) {
                        System.out.print("Would you like to add or remove a class? (a/r): ");
                        String edit = stdin.next();
                        if(edit.equals("a")) {
                            teachers.add();
                        }
                        else if(edit.equals("r")) {
                            teachers.remove();
                        }
                    }
                    else {
                        System.out.println("Could not find teacher named " + name);
                    }
                }
            }
            else {
                System.out.println("Invalid command");
            }
        }
        System.out.println("Program terminated");
    }
}

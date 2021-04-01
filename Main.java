import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        ArrayList<SchoolMember> schoolMembers = new ArrayList<>();

        while(true) {
            System.out.println("1) Add a new student");
            System.out.println("2) Add a new teacher");
            System.out.println("3) List all school members");
            System.out.println("4) Edit a student's profile");
            System.out.println("5) Edit a teacher's profile");
            System.out.println("0) Exit");

            System.out.print("> ");
            int command = stdin.nextInt();
            if(command == 0) break;
            else if(command == 1) {
                schoolMembers.add(new Student());
            }
            else if(command == 2) {
                schoolMembers.add(new CompTeacher());
            }
            else if(command == 3) {
                for(SchoolMember sm : schoolMembers) {
                    System.out.println(sm.toString());
                }
            }
            else if(command == 4) {
                System.out.println("What is the name the student you would like to edit: ");
                String name = stdin.next();
                for(int i = 0; i < schoolMembers.size(); i++) {
                    SchoolMember member = schoolMembers.get(i);
                    if(member.getName().equals(name)) {
                        System.out.println("Would you like to add or remove a class? (a/r): ");
                        String edit = stdin.next();
                        if(edit.equals("a")) {
                            Student s = (Student) member;
                            s.add();
                        }
                        else if(edit.equals("r")) {
                            Student s = (Student) member;
                            s.remove();
                        }
                    }
                }
            }
            else if(command == 5 ) {
                System.out.println("What is the name the teacher you would like to edit: ");
                String name = stdin.next();
                for(int i = 0; i < schoolMembers.size(); i++) {
                    SchoolMember member = schoolMembers.get(i);
                    if(member.getName().equals(name)) {
                        System.out.println("Would you like to add or remove a class? (a/r): ");
                        String edit = stdin.next();
                        if(edit.equals("a")) {
                            Teacher t = (Teacher) member;
                            t.add();
                        }
                        else if(edit.equals("r")) {
                            Teacher t = (Teacher) member;
                            t.remove();
                        }
                    }
                }
            }
            else {
                System.out.println("Invalid command");
            }
        }

    }
}

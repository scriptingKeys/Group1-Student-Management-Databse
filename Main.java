public class Main {
    public static void main(String[] args){
        Student s = new Student();

        s.setClasses();

        System.out.println(s.getClasses());

        //s.add();
        s.remove();

        System.out.println(s.getClasses());
    }
}

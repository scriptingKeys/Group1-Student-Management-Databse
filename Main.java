public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.getClasses());

        s1.remove();

        System.out.println(s1.getClasses());
    }
}

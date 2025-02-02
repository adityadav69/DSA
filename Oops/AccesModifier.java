public class AccesModifier {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aditya";
        s1.rollNo=13;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        // s1.pass="ada";
        // System.out.println(s1.pass);

    }
}
class Student{
    String name;
    int rollNo;
    private String pass; //only access through the getter of setter of the class
}

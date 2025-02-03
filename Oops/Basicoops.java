public class Basicoops{
    // class Student{

    // }// When we intitalize class here then we can't create object of this class from main function because main functioon is static function if we want then we have to make this class as static
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.name="Aditya";
        s1.roll_no=13;
        System.out.println(s1.name);
        System.out.println(s1.roll_no);

    }
}
class Student{
    String name;
    int roll_no;
}
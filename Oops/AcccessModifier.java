public class AcccessModifier {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aditya";
        s1.roll_no=13;
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        // s1.pass="afd";//This will throw error because pass is private variable
    }
}

class Student{
    String name;
    int roll_no;
    // private String pass;
}

/*
AcccessModifier     withinClass     withinPackage       outsidePackageBySubClass        outside package

private                 yes             no                  no                                  no

Default                 yes             yes                 no                                  no

protected               yes             yes                 yes                                 no

public                  yes             yes                 yes                                 yes

*/

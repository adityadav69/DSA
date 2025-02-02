public class getterAndSetter {
        public static void main(String[] args) {
            Student s1=new Student();
            s1.name="Aditya";
            s1.roll_no=13;
            System.out.println(s1.name);
            System.out.println(s1.roll_no);
            s1.setPass("Aditya yadav");
            System.out.println(s1.getPass());
            // s1.pass="afd";//This will throw error because pass is private variable
        }
    }
    
    class Student{
        String name;
        int roll_no;
        private String pass;
        void setPass(String pass){
            this.pass=pass;
        }
        String getPass(){
            return this.pass;
        }
}

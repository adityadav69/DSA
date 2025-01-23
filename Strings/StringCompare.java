public class StringCompare {
    public static void main(String[] args) {
        String s1="Aditya";
        String s2="Aditya";
        String s3=new String("Aditya");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);

        // .equals() only check the value of string 
        System.out.println(s1.equals(s3));


    }
}

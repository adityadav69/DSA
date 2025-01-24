public class Uppercases {

    public static void convertor(StringBuilder s1){
        StringBuilder s2=new StringBuilder("");
        char ch=s1.charAt(0);
        s2.append(Character.toUpperCase(ch));
        for(int i=1;i<s1.length();i++){
            if(s1.charAt(i)==' ' && i<s1.length()-1){
                s2.append(s1.charAt(i));
                i++;
                s2.append(Character.toUpperCase(s1.charAt(i)));
            }
            else{
                s2.append(s1.charAt(i));
            }
        }
        System.out.println(s2);
    }
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("aditya yadav");
        convertor(s1);
        
    }
}

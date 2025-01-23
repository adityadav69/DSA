public class StringSubString {

    public static String SubString(String s,int startingIndex,int endingIndex){
        String s2="";
        for(int i=startingIndex;i<endingIndex;i++){
            s2=s2+s.charAt(i);
        }
        return s2;
    }
    public static void main(String[] args) {
        String s="Aditya";
        System.out.println(SubString(s, 0, 4));
        System.out.println(s.substring(0,4));
        
    }
}

public class StringsBuilder{
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            s1.append(ch);
        }
        System.out.println(s1);
    }
}
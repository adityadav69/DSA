import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static boolean check(String s1, String s2){
       char c1[]=s1.toCharArray();
       char c2[]=s2.toCharArray();

       if(c1.length==c2.length){
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            return true;
        }
        else{
            return false;
        }
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if(check(s1, s2)){
            System.out.println("Both are anagrams");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}

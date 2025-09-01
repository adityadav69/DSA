import java.util.*;
public class HashingImplementation {
    public static void main(String[] args) {
        HashMap <String,Integer> hm=new HashMap<>();
        //Insertion in hashmap
        hm.put("india", 150);
        hm.put("Nepal", 4);
        hm.put("Indonesia", 12);

        //Get in hashmap
        // System.out.println(hm);
        System.out.println(hm.get("india"));

        //Containsin
        System.out.println(hm.containsKey("indonesia"));
    }
}

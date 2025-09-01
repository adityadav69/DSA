import java.util.*;
public class HashingImplementation {
    public static void main(String[] args) {
        HashMap <String,Integer> hm=new HashMap<>();
        //Insertion in hashmap
        hm.put("india", 150);
        hm.put("Nepal", 4);
        hm.put("China", 12);

        //Get in hashmap
        // System.out.println(hm);
        System.out.println(hm.get("india"));

        //Containsin
        System.out.println(hm.containsKey("Indonesia"));


        System.out.println(hm);
        //remove function
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //getSize;
        System.out.println(hm.size());

        //clear
        hm.clear();
        System.out.println(hm);

    }
}

import java.util.*;
public class IterationOnHashMapThrouhgSet {

    public static void main(String[] args) {
        HashMap <String,Integer> hm=new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 12);
        hm.put("Nepal", 43);
        hm.put("Indonesia", 89);
        hm.put("America", 99); 
        
        Set <String> keys=hm.keySet();
        for (String key : keys) {
            System.out.println(key+" This was key and this is value "+hm.get(key));
        }

    }
}
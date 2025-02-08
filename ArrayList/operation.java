import java.util.*;
public class operation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add() add last index 
        list.add(3);
        list.add(32);
        list.add(12);
        System.out.println(list);

        //get() element from list
        System.out.println(list.get(2));

        //remove element ()
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        // set elements on given index

        list.set(0, 45);
        System.out.println(list);
        
        //contains 
        System.out.println(list.contains(45));


    }
}

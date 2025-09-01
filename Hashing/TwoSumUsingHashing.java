import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumUsingHashing {

    static void twoSum(int arr[],int target){
        ArrayList <Integer> result=new ArrayList<>();
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ts=target-arr[i];
            if(hm.containsKey(ts)){
                result.add(hm.get(ts));
                result.add(i);
                System.out.println(result);
                return;
            }
            else{
               hm.put(arr[i],i) ;
            }
        }
        System.out.println("None");

    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        twoSum(arr, 14);
    }
}

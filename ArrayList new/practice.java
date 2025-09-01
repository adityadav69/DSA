import java.util.*;
public class practice {

    static int getSecondLargest(int arr[]){
        Arrays.sort(arr);
                int largest=arr[arr.length-1];
                System.out.println("loop ke bahar");
                for(int i=arr.length-2;i<=0;i--){
                    System.out.println("loop ke andar");
                    System.out.println("i="+i+"arr[i]="+arr[i]+"and largest="+largest);
                    if(arr[i]!=largest){
                        System.out.println("ek bar");
                        return arr[i];
                    }
                }
                return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,4,5};
        System.out.println(getSecondLargest(arr));
        
    }
}

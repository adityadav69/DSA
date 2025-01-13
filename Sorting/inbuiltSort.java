import java.util.*;
public class inbuiltSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        int arr[]={3,4,1,4,63,1};
        // Arrays.sort(arr);
        print(arr);
        // If we want to sort the array with some given index then
        Arrays.sort(arr,0,4);
        System.out.println("After sorting");
        print(arr);

    }
}

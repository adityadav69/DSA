import java.sql.Array;
import java.util.Arrays;

public class copy{

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr1[]={5,6,7,8,9};
        System.out.println("Array 1 is ");
        printArray(arr1);
        int arr2[];
        arr2=Arrays.copyOf(arr1,arr1.length);
        printArray(arr2);

        arr2[1]=999;
        System.out.println("After changing arr2 arr1 is");
        printArray(arr1);


    }
}
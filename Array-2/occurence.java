import java.util.Scanner;

public class occurence {

    static int TotalOccurence(int arr[],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }
    static int LastOccurence(int arr[],int key){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
            }
        }
        return index;
    }
    static int StrictlyGreater(int arr[],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>key){
                count++;
            }
        }
        return count;
    }

    static boolean isSortedInIncreasing(int arr[]){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                return isSorted;
            }
        }
        return isSorted;
    }

    static int[] smallestLargestElement(int arr[]){
        int temp[]=new int[2];
        int smallest=Integer.MAX_VALUE;
        int greatest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        temp[0]=smallest;
        temp[1]=greatest;
        return temp;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Key:");
        int key=sc.nextInt();
        // System.out.println(key+" Occur "+TotalOccurence(arr,key)+" times");
        // System.out.println(key+" Occur Last time at index "+LastOccurence(arr,key));
        // System.out.println("count of number which is Greater than  "+key+" is "+StrictlyGreater(arr,key));
        // if(isSortedInIncreasing(arr)){
        //     System.out.println("Array is sorted in increasing order");
        // }
        // else{
        //     System.out.println("Not Sorted");
        // }
        int arr2[]=smallestLargestElement(arr);
        System.out.println("Smallest number in arr is "+arr2[0]+" and greatest number is"+arr2[1]);

    }
}

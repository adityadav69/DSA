public class Largest_number {

    public static int largestFind(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,532,53,1222};
        System.out.println("Largest number in the array is "+largestFind(arr));
    }
}

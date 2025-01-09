public class Smallest_number {

    public static int largestFind(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,532,0,53,1222};
        System.out.println("Smallest number in the array is "+largestFind(arr));
    }
}

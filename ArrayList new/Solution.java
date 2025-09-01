class Solution {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }

        System.out.println(largest+" largest");
        System.out.println(second_largest+" second_largest");
        
        if(largest==second_largest){
            return -1;
        }
        else{
            return second_largest;
        }
        
        
    }

    public static void main(String[] args) {
        int arr[]={10,10,10};
        System.out.println(getSecondLargest(arr));
    }
}
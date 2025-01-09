public class Binary_Search {

    public static int binary(int key,int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,23,53,566,1213};
        int result=binary(53,arr);
        if(result==-1){
            System.out.println("Key not Found");
        }
        else{
            System.out.println("Key is "+result);
        }
    }
}

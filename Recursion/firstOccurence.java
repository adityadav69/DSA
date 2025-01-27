public class firstOccurence {

    public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,7,5,4,2,5,6};
        System.out.println(firstOcc(arr, 0, 5));
    }
}

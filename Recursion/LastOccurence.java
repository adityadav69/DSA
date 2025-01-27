public class LastOccurence {
    public static int checkLast(int arr[],int i,int key){

        if(i==-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return checkLast(arr, i-1, key);

    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5};
        System.out.println(checkLast(arr, arr.length-1, 5));
    }
}

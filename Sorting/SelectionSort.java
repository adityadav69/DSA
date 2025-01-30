public class SelectionSort {

    public static void sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    int temp=arr[minpos];
                    arr[minpos]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,63,1,2,11,21,11};
        sort(arr);
        print(arr);
    }
}

public class InsertionSort{

    public static void insertionsort(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,52,56,7,1};
        insertionsort(arr);
        print(arr);

    }
}
public class bubble{

    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){

                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
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
        int arr[]={1,7,3,4,8};
        sort(arr);
        print(arr);
    }
}
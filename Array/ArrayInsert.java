public class ArrayInsert {

    public static void push(int index,int arr[],int value){
        
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=1;
        arr[1]=4;
        arr[2]=3;
        arr[3]=9;
        arr[4]=7;

        print(arr);
        push(3, arr,45);
        System.out.println("After insertion");
        print(arr);
    }
}

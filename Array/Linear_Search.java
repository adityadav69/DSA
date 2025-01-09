public class Linear_Search {

    public static int Search(int key,int arr[]){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
        }
         public static void main(String[] args) {
            int arr[]={2,43,52,1,32};
            int result=Search(43,arr);
            if(result==-1){
                System.out.println("Key not Found");
            }
            else{
                System.out.println("Key is "+result);
            }

     }
}
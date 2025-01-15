public class insertion {

        public static void sort(int arr[]){
           for(int i=1;i<=arr.length-1;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
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

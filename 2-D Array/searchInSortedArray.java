public class searchInSortedArray {

    public static void Search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr[0].length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[i][mid]==key){
                    System.out.println("i= "+i +" & j= "+mid);
                    return;
                }
                else if(key>arr[i][mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,25,45},{27,29,37,48},{32,33,39,50}};
        Search(arr, 50);
    }
}

public class staricaseSearch {
    public static void search(int arr[][],int key){
        int row=0;
        int column=arr[0].length-1;
        while (row<arr.length && column>=0) {
            if(key==arr[row][column]){
                System.out.println("key is in "+row+" row "+column+" column");
                return;
            }
            else if(key>arr[row][column]){
                row++;
            }
            else{
                column--;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,25,45},{27,29,37,48},{32,33,39,50}};
        search(arr, 50);
    }
}

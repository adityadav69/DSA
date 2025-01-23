public class staircase{
    public static void search(int arr[][],int key){
        int row=0;
        int column=arr[0].length-1;
        while(row<arr.length && column>=0){
            if(arr[row][column]==key){
                System.out.println("Key is at "+row+" "+column+" position");
                return;
            }
            else if(arr[row][column]>key){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found.");
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},{15,25,25,45},{27,29,37,48},{32,33,39,50}};
        search(arr, 25);
    }
}
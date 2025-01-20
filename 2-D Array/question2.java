public class question2 {

    public static void printSum(int arr[][],int rowNumber){
        int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[rowNumber][j];
        }
        System.out.println("Sum of the "+rowNumber+"'s row is "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        printSum(arr, 2);
    }
}

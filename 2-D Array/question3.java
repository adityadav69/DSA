public class question3 {

    public static void Transpose(int arr[][],int traspose[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                traspose[j][i]=arr[i][j];
            }
        }
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{1,5,6}};
        int traspose[][]=new int[3][3];
        print(arr);
        Transpose(arr, traspose);
        System.out.println();
        print(traspose);

    }
}

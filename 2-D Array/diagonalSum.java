public class diagonalSum {

    public static void calculateSum(int arr[][]){
        int column=arr[0].length;
        int row=arr.length;
        int Primarysum=0;
        int secondarySum=0;
        // System.out.println("row= "+row+ " column="+column);
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<column;j++){
        //         if(i==j){
        //             Primarysum=Primarysum+arr[i][j];
        //             System.out.println("arr[i][j] ="+arr[i][j]);
        //         }
        //         else if(i+j==(row-1) && i!=j){
        //             secondarySum+=arr[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            Primarysum+=arr[i][i];
            if(i!=arr.length-i-1){
                secondarySum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println("Sum is "+Primarysum);
        System.out.println("Sum is "+secondarySum);
        int totalSum=Primarysum+secondarySum;
        System.out.println("Total sum is"+totalSum);
        
    }

    // 1,2,3,4
    // 4,5,2,5
    // 2,1,4,3
    // 3,4,1,1
    
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{4,5,2,5},{2,1,4,3},{3,4,1,1}};
        calculateSum(arr);
    }
}

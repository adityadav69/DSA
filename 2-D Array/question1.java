public class question1 {

    public static void countNumber(int key,int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("Count of "+key+ "'s is "+count);
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        countNumber(8, arr);
    }
}

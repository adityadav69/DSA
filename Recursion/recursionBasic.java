public class recursionBasic{

    public static void printDes(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDes(n-1);
    }
    public static void main(String args[]){
        printDes(50);
    }
}
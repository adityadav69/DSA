public class powerOf2orNot {

    public static void check(int n){
        if((n & n-1)==0){
            System.out.println("Number is power of 2");
        }
        else{
            System.out.println("Number is not the power of 2");
        }
    }
    public static void main(String[] args) {
        check(19);
    }
}

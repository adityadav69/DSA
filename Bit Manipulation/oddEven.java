public class oddEven {

    public static void check(int n){
        int bitMask=1;
        if((n & bitMask)==1){
            System.out.println(n+" Number is odd");
        }
        else{
            System.out.println(n+" Number is even");
        }
    }
    public static void main(String[] args) {
        check(3);
        check(32);
        check(31);
        check(37);

    }
}

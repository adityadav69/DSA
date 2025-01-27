public class RecursionFibnosii {

    public static int fibnosii(int n){
        if(n==1 || n==0){
            return n;
        }
        
        int fnm1=fibnosii(n-1);
        int fnm2=fibnosii(n-2);
        int fib=fnm1+fnm2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibnosii(50));
    }
}

public class factorial {

    public static int Calcfactorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Calcfactorial(n-1);
        int fact=n*fnm1;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(Calcfactorial(5));
    }
}

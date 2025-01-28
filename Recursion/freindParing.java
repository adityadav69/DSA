public class freindParing {

    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }

        int single=pair(n-1);
        int fnpair=pair(n-2);
        int fnpairTotalWay=(n-1)*fnpair;
        return single+fnpairTotalWay;
    }
    public static void main(String[] args) {
        System.out.println(pair(5));
    }
}

public class TilingProblem {

    public static int tilingWay(int n){// 2*n

        if(n==0 || n==1){
            return 1;
        }

        int verticalchoice=tilingWay(n-1);
        int horizontalchoice=tilingWay(n-2);
        int totalWay=verticalchoice+horizontalchoice;
        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(tilingWay(18));
    }
}

class tilingProblem{

    public static int tilingWay(int n){
        if(n==0 || n==1){
            return 1;
        }
        //verical
        int fnm1=tilingWay(n-1);
        // horizontal 
        int fnm2=tilingWay(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tilingWay(3));
    }
}
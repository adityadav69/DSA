public class get_ith_place {

    public static int get(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get(10, 2));
        System.out.println(get(10, 3));
    }
}

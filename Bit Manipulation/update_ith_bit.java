public class update_ith_bit {

    public static int update(int n,int i,int value){
        if(value==1){
            int bitMask=1<<i;
            return n | bitMask;
        }
        else{
            int bitMask=~(1<<i);
            return n & bitMask;
        }
    }
    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }
}

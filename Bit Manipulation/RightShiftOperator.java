public class RightShiftOperator {
    public static void main(String[] args) {
        // 5>>2 
        // 5- 000101
        // 2- 000010
        // 5>>2 == 000001 ==1
        // a>>b=a / 2^b 
        // 5/2^2=1;

        System.out.println(5>>2);
        System.out.println(6>>1);
        // 000110
        // 000011 ==3
    }
}

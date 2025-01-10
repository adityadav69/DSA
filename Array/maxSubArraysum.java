public class maxSubArraysum {

    public static void printSubArray(int arr[]) {
        int maxsubArraysum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                System.out.println("sum is " + sum);
                if (sum > maxsubArraysum) {
                    maxsubArraysum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxsubArraysum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}
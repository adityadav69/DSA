class RecursionBasic{

    public static void printNumberDecreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+ " ");
        printNumberDecreasing(n-1);
    }
    public static void printNumberincreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNumberincreasing(n-1);
        System.out.print(n+" ");

    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1=factorial(n-1);
        return n*fnm1;
    }

    public static int sumOfN(int n){
       if(n==1){
        return n;
       }
       int snm1=sumOfN(n-1);
       return n+snm1;

    }
    public static int fibnossi(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibNM1=fibnossi(n-1);
        int fibNM2=fibnossi(n-2);
        return fibNM1+fibNM2;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // public static int lastOcurence(int arr[],int key,int i){
    //     if(i==-1){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return lastOcurence(arr, key, i-1);
    // }
    public static int lastOcurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int result=lastOcurence(arr, key, i+1);
        if(arr[i]==key){
            return i;
        }
        if(result!=-1){
            return result;
        }
        return -1;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pNM1=power(x, n-1);
        return x*pNM1;
    }

    public static void main(String[] args) {
        // printNumberDecreasing(10);
        // printNumberincreasing(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfN(5));
        // System.out.println(fibnossi(6));
        int arr[]={1,2,3,40,5,12,42,42,45,3,2,4,5,99};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 100, 0));
        System.out.println(lastOcurence(arr, 99, arr.length-1));
        // System.out.println(power(2, 10));
    }
}
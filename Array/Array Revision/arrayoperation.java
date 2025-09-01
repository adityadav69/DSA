import java.util.*;

public class arrayoperation {

    static int size;

    static void traversal(int arr[]) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionAtBeginning(int arr[], int element) {
        size = size + 1;
        arr[size - 1] = element;
    }

    static void insertionAtIndex(int arr[], int element, int index) {
        for (int i = size; i >= index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size++;
        System.out.println("inserted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Before insertion");
        // System.out.println("before insertion size is "+size);
        // traversal(arr,size);
        // insertionAtBeginning(arr, 99);
        // System.out.println("After insertion");
        // traversal(arr,size);
        // System.out.println("After insertion size is "+size);
        System.out.println("Enter the index you want to enter the element");
        int index = sc.nextInt();
        insertionAtIndex(arr, 6969, index);
        traversal(arr);
        System.out.println("After insertion size is " + size);

    }
}

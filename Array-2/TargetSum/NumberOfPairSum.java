// package TargetSum;

import java.util.Scanner;

public class NumberOfPairSum {

    static int countPairSum(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Target:");
        int target=sc.nextInt();
        System.out.println(countPairSum(arr, target));

    }
}



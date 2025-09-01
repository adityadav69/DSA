// package TargetSum;

import java.util.Scanner;

public class NumberofTripletSum {
     static int countTripletSum(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
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
        System.out.println(countTripletSum(arr, target));

    }
}

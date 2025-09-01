// package TargetSum;

import java.util.Scanner;

public class findUnique {
    
    static int findUnique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }

        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                ans= arr[i];
            }
        }
        return ans;

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

        System.out.println(findUnique(arr));

    }
}

public class mergesort{

    public static void print(int arr[]){
        int i=0;
        while(i!=arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //Right
        merge(arr,si,ei,mid);
    }
    
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[(ei-si)+1];
        int i=si; //starting index of left part
        int j=mid+1; //Starting index of right part
        int k=0; // starting index of temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover element of 1st sorted part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //for leftover element of 2nd sorted part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        for(k=0, i=si ;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,8,2,5,9};
        print(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println();
        print(arr);

    }
}
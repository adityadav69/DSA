public class mergeSort1{

    public static void merge(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        merge(arr, si, mid);
        merge(arr, mid+1, ei);
        mergeSort(arr,si,ei,mid);
    }

    public static void mergeSort(int arr[],int si,int ei,int mid){
        int arr2[]=new int[(ei-si)+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                arr2[k]=arr[i];
                k++;
                i++;
            }
            else{
                arr2[k]=arr[j];
                j++;
                k++;
            }
        }

        while (i<=mid) {
            arr2[k]=arr[i];
            k++;
            i++;
        }
        while (j<=ei) {
            arr2[k]=arr[j];
            k++;
            j++;
        }
        for(k=0;k<arr2.length;k++){
            arr[si+k]=arr2[k];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={3,1,4,65,22,12};
        merge(arr, 0, arr.length-1);
        print(arr);
    }
}
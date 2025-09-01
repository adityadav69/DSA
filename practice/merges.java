public class merges {

    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,mid,si,ei);
    }
    public static void merge(int arr[],int mid,int si,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void print(int arr[]){
        int i=0;
        while (i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        print(arr);
    }
}

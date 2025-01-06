public class MergeSort {
    static void merge(int arr[], int start,int mid ,int end){
        int size1=mid-start+1;
        int size2=end-mid;
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];

        for(int i=0;i<size1;i++){
            arr1[i]=arr[start+i];
        }
        for(int j = 0; j < size2; j++){
            arr2[j]=arr[mid+1+j];                        
        }
        int i=0;
        int j=0;
        int k=start;

        while (i <size1 && j<size2 ) {
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }else{
                arr[k]=arr2[j];
                k++;
                j++;
            }
            
        }
        while(i<size1){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        
        while(j<size2){
            arr[k]=arr2[j];
            k++;
            j++;
        }

    }
    public static void mergesort(int[] arr, int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr, start, mid, end);

    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        mergesort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    
}

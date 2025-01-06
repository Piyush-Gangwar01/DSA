public class QuickSort {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static int partition(int arr[],int start, int end){
        int pivit=arr[start];
        int count=0;
        for (int i = start+1; i < arr.length; i++) {
            if (arr[i]<=pivit) {
                count++;
                    
            }
            
        }
        int pi=start+count;
        swap(arr, start, pi);

      return pi;
    }
    public static void quickSort(int arr[], int start, int end){
        if (start>=end) {
            return;
        }
        int pi=partition(arr, start, end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,7,9,3};
        quickSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
        
    }
    
}

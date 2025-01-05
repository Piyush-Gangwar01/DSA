public class InsertionSort {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,9,4};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    
}

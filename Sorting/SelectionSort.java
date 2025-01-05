public class SelectionSort {
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static  void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int Minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[Minindex]){
                    Minindex=j;
                }
            }
            swap(arr, i, Minindex);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,7,9,3};
        sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }

        
    }
    
}

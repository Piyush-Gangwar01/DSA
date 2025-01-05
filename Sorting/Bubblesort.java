public class Bubblesort {
    /*
      In Bubble sort you have to check the adjacent element if 
      left is greater swap 
     */
    public static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void sort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++ ){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
                 
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,7,4,3,1};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
    }
    
}

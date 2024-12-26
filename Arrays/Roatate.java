public class Roatate {
    // using extra  space 
    public static int[] rotate1(int arr[], int k){
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int start=0;
        for(int i=n-k;i<n;i++){
            ans[start]=arr[i];
            start++;
        }
        for(int j=0;j<n-k;j++){
            ans[start]=arr[j];
            start++;
        }
        return ans;        
    }
    // swap method
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // reverse an array
    static void rev(int []arr,int start,int end){
        int i=start , j=end;
        while(j>i){
            swap(arr, i, j);    
            i++;
            j--;
        }
    }
    // wihtout using extra space 
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        rev(arr,0,n-k-1);
        rev(arr, n-k, n-1);
        rev(arr, 0, n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        // without etxtra Space 
        rotate(arr,k);
        for(int num : arr){
            System.out.print(num+" ");
        } 
        System.out.println();

        int ans[]=rotate1(arr, k);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }    
}

public class Prefixsum {
    public static void sum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
            
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        sum(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    
}

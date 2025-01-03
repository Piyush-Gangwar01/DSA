public class Sum {
    public static int sum(int arr[],int idx){
        if(arr.length==idx){
            return 1;
        }
        int rec=sum(arr, idx+1);
        return arr[idx]+rec;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,2,1};
        System.out.println(sum(arr, 0));
        
    }
    
}

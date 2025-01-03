public class Max {
    public static int max(int arr[],int idx ){
        if(arr.length-1==idx){
            return arr[idx];
        }
        int rec=max(arr, idx+1);
        return Math.max(rec, arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,9,3};
        System.out.println(max(arr, 0));

    }    
}

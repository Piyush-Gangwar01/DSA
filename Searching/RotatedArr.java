public class RotatedArr {
    public static int  search(int arr[] ){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(end>start){
            int mid=start+(end-start)/2;;
             if(arr[mid]>arr[end]){
                start=mid+1;
            }else{
                ans=mid;
                end=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int arr[]={5,6,1,2,3,4};
        System.out.println(search(arr));
        

    }
}

public class BinarySearch {
    static int search(int arr[],int target){
        int start=0 , end=arr.length;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return start;
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,6,8,9};
        int target=5;
        int ans=search(arr, target);
        System.out.printf("%d is at %d index",target,ans);
    }
}

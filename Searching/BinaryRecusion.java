public class BinaryRecusion {  
    static void searchRec(int arr[],int start , int end ,int target){
        if(start>end) return;
        int mid =start+(end-start)/2;
        if(arr[mid]==target){
            System.out.print(mid);
        }else if(arr[mid]>target){
            searchRec(arr, start, mid-1, target);
        }else{
            searchRec(arr, mid+1, end, target);
        }
        
         
    } 
    public static void main(String[] args) {
        int arr[]={3,5,6,8,9};
        int target=5;
        searchRec(arr, 0, arr.length, target);
        
    }
    
}

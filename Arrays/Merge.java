public class Merge {
    public static int[] merge(int []nums1, int nums2[]){
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[j+nums1.length]=nums2[j];
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,6};
        int nums2[]={7,8,9};
        int [] ans=merge(nums1, nums2);
        for(int i: ans){
            System.out.print(i+" ");
        }       
        
        

    }
    
}

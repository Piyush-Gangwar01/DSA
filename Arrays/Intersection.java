import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static ArrayList<Integer> intersection(int [] nums1,int nums2[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);

                }
            }
        }
        return list;
    }
    // method 2 ( using hashset)
    public static ArrayList<Integer> intersection2(int nums1[],int nums2[]){
        ArrayList<Integer> list =new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i: nums1){
            set.add(i);
        }
        for(int j:nums2){
            if(set.contains(j)){
                list.add(j);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []nums1={1,2,3,4,5};
        int[] nums2={2,4,9,8,10};
        System.out.println(intersection(nums1, nums2));
        System.out.println(intersection2(nums1, nums2));

    }
    
}


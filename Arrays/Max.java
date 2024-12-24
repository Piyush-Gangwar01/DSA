public class Max {
    public static int max(int[] arr){
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];

            }
        }
        return m;
    }
    public static void main(String[] args) {
        int [] arr={1,8,5,2,9,3};
        System.out.println(max(arr));
        
    }
    
}

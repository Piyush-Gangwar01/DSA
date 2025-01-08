class  SearchIn2Darr{
    static void seach(int[][] arr,int target){
        int start=0,end=arr.length;
        int n=arr.length;
        int m=arr[0].length;
        while(end>start){
            int mid=start+(end-start)/2;
            int midelement=arr[mid/m][mid%m];
            if(midelement==target){
                System.out.println("yes");
                return;
            }else if(midelement<target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        seach(arr, target);

    }
}
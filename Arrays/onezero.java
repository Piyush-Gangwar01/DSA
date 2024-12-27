public class onezero {
    public static void sort(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    // Method 2 
    public static void sort2(int arr[]){
        int start=0;
        int end =arr.length-1;
        while(end>start){
            if(arr[start]==0 && arr[end] == 1){
                start++;
                end--;
            }else{
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1,0};
        sort2(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}

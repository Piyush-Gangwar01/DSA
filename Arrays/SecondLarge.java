public class SecondLarge {
    public static int Find(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=0;
            }
            if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,8,3,2};
        System.out.println(Find(arr));
    }
    
}

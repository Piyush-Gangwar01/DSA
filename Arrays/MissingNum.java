public class MissingNum {
    public static int miss(int arr[]){
        int n=arr.length+1;
        int actualsum= (n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        return actualsum-sum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(miss(arr));

    }
    
}

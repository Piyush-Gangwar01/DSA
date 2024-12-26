public class firstoccur {
    public static void first(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,4,6};
        first(arr);

    }    
}

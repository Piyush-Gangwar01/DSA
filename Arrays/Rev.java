public class Rev {
    public static void rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            if(end!=start){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        rev(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    
}

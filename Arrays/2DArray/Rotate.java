public class Rotate {
    // for 90 degree rotae 
    // step 1 --> transpose 
    // step 2 --> reverse each row
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rev(int[] arr){
            int i=0, j=arr.length-1;
            while(j>i){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        
    }
    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void rotate(int [][]arr){
        
        transpose(arr); // step1 
        // rev each row 
        for(int i=0;i<arr.length;i++){
            rev(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        rotate(arr);
        print(arr); 
    }
    
}

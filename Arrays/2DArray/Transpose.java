public class Transpose {
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // with extra Space 
    public static int[][] transpose(int [][]arr){
        int [][] ans=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    // Without using extra space 
    public static void transpose2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];// so that value is not lost after putting 
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int ans[][]=transpose(arr);
        print(ans);
        System.out.println("Wihtout using extra Space ");

        transpose2(arr);
        print(arr);
    }
    
}

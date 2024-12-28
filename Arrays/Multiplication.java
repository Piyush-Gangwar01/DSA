import java.util.*;
public class Multiplication {
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] Add(int arr[][],int [][]arr2){
        if(arr.length!=arr2.length || arr[0].length!=arr2[0].length){
            System.out.println("addtion not possible ");
            return new int[0][0];
        }
        int[][] ans=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                ans[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        return ans ;
    }
    public static int[][] Multiply(int [][] arr,int [][] arr2){
        int r1=arr[0].length, c1=arr.length;
        int r2=arr2[0].length, c2=arr2.length; 
        if(c1!=r2){
            System.out.println(" multiplication not possible");
            return new int[0][0];
        }
        int [][] ans= new int[r1][c2];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=arr[i][k]*arr2[k][j];


                }
                
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of col:");
        int col=sc.nextInt();
        System.out.println("Array 1 ");
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("array print ");
        print(arr);
        System.out.println();
        System.out.println("Array 2 ");
        int[][] arr2=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("array2 print ");
        print(arr2);

        System.out.println("Additon :");
        int [][] ans =Add(arr, arr2);
        print(ans);

        System.out.println(" multiplication :");
        int ans1[][]=Multiply(arr, arr2);
        print(ans);

    }
    
}

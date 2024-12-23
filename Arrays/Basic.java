import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter col:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Input for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the array elements
        System.out.println("The elements of the array are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

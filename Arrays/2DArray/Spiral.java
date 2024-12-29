public class Spiral {
    
    public static void spiral(int arr[][]) {
        int toprow = 0, bottomrow = arr.length - 1;
        int colstart = 0, colend = arr[0].length - 1;
        int totalelement = arr.length * arr[0].length;

        while (totalelement > 0) {
            // Top row -> left to right
            for (int i = colstart; i <= colend && totalelement > 0; i++) {
                System.out.print(arr[toprow][i] + " ");
                totalelement--;
            }
            toprow++;

            // Right column -> top to bottom
            for (int i = toprow; i <= bottomrow && totalelement > 0; i++) {
                System.out.print(arr[i][colend] + " ");
                totalelement--;
            }
            colend--;

            // Bottom row -> right to left
            for (int i = colend; i >= colstart && totalelement > 0; i--) {
                System.out.print(arr[bottomrow][i] + " ");
                totalelement--;
            }
            bottomrow--;

            // Left column -> bottom to top
            for (int i = bottomrow; i >= toprow && totalelement > 0; i--) {
                System.out.print(arr[i][colstart] + " ");
                totalelement--;
            }
            colstart++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiral(arr);
    }
}

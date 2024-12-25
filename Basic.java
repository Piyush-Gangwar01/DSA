public class Basic {
    public static void main(String[] args) {

        // Clone an array
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = arr.clone();

        // Print cloned array elements
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}


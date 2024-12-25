import java.util.ArrayList;

public class TargetSum {
    public static ArrayList<ArrayList<Integer>> tar(int arr[], int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;

                    // Create a pair and add it to the list
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    list.add(pair);
                }
            }
        }

        System.out.println("Count: " + count);
        System.out.println("Pairs: " + list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;

        System.out.println(tar(arr, target));
    }
}

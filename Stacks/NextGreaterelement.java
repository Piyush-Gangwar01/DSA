import java.util.*;
public class NextGreaterelement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            // Remove elements smaller than or equal to the current element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element exists
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // Push the current element to the stack
            st.push(arr[i]);
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}

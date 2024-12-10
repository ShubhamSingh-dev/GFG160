import java.util.*;

public class Array_2 {

    // Approach 1 with TC = O(n) and SC = O(1)
    // Using two pointers we are shifting non-zero elements in front and then adding zeros at the end
    public static void pushZeroToEnd_1(int[] arr) {
        // Count of non-zero elements
        int count = 0;

        // If the element is non-zero, replace the element at
        // index 'count' with this element and increment count
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (count < arr.length)
            arr[count++] = 0;
    }

    // Approach 2 with TC = O(n) and SC = O(1)
    // Using two pointers we are swapping the elements
    public static void pushZeroToEnd_2(int[] arr) {
        // Pointer to track the position for next non-zero element
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to the next position
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        
        // Uncomment either approach you want to test
        // pushZeroToEnd_1(arr);
        pushZeroToEnd_2(arr);
        
        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Array_3 {

  // Approach 1: Reversing the array using two pointers (left and right)
  static void reverseArray_1(int[] arr) {
      // Initialize left to the beginning and right to the end
      int left = 0, right = arr.length - 1;

      // Iterate till left is less than right
      while (left < right) {
          // Swap the elements at left and right position
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          // Increment the left pointer
          left++;

          // Decrement the right pointer
          right--;
      }
  }

  // Approach 2: Reversing the array by swapping elements in the first half with the second half
  static void reverseArray_2(int[] arr) {
      int n = arr.length;

      // Iterate over the first half and for every index i,
      // swap arr[i] with arr[n - i - 1]
      for (int i = 0; i < n / 2; i++) {
          int temp = arr[i];
          arr[i] = arr[n - i - 1];
          arr[n - i - 1] = temp;
      }
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

      
      // reverseArray_1(arr);
      reverseArray_2(arr);

      
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}

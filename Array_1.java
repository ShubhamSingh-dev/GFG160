import java.util.*;

public class Array_1 {

  static int getSecondLargest(int[] arr) {
    int n = arr.length;

    int largest = -1;
    int secondLargest = -1;

    for (int i=0; i<n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      }

      else if (arr[i] < largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;



  }
  public static void main(String[] args) {
    int[] arr = {12, 13, 1, 10, 34, 1};
    System.out.println(getSecondLargest(arr));
  }
}
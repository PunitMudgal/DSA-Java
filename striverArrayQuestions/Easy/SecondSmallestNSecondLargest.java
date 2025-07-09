// Find Second Smallest and Second Largest Element in an array

package Easy;

import java.util.Arrays;

public class SecondSmallestNSecondLargest {
    public static void main(String[] args) {

        int[] arr = { 1 };
        System.out.println("Second Smallest Elem: " + FindSecondSmallest(arr));
        System.out.println("Second Largest Elem: " + FindSecondLargest(arr));
    }

    static int FindSecondLargest(int[] arr) {
        if (arr.length <= 1)
            return -1;

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] != arr[i - 1])
                return arr[i - 1];
        }
        return -1;
    }

    static int FindSecondSmallest(int[] arr) {
        int secondSmallest = -1;
        if (arr.length <= 1)
            return secondSmallest;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }
}

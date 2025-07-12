// https://leetcode.com/problems/rotate-array/description/

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

package Medium;

import java.util.Arrays;

public class RotateArrayAtK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(RotateAtK(arr, 3)));
    }

    static int[] RotateAtK(int[] arr, int k) {
        if (arr.length <= 1) {
            return arr;
        }
        int[] tempArray = new int[(arr.length - 1) - k];
        int tempPointer = 0;

        // add elements after kth position in temp array
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = arr[tempPointer];
            tempPointer++;
        }

        // shirt original array
        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[k + 1];
            k++;
        }

    }
}

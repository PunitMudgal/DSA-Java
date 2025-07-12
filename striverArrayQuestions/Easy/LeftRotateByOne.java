package Easy;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 4 };
        // System.out.println(Arrays.toString(RotateLeft(arr)));
        System.out.println("Optamized solution: " + Arrays.toString(RotateLeft2(arr)));
    }

    // brute force approach, time complexity = O(n) & space complexity = O(n)
    static int[] RotateLeft(int[] arr) {
        // edge case
        if (arr.length <= 1)
            return arr;
        int[] rotatedArray = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            rotatedArray[i - 1] = arr[i];
        }
        rotatedArray[rotatedArray.length - 1] = arr[0];
        return rotatedArray;
    }

    // optimized approach
    static int[] RotateLeft2(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int temp = arr[0]; // storing first element of array
        for (int i = 0; i < arr.length - 1; i++) { // iterating the array till last 2nd element
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp; // assign value to last index
        return arr;
    }
}

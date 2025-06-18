package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 18, 45, 01 };
        int[] answer = reverse(arr, 0, arr.length - 1);
        System.out.println("Answer: " + Arrays.toString(answer));

    }

    static int[] reverse(int arr[], int s, int e) {
        if (s >= e) {
            return arr;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return reverse(arr, s + 1, e - 1);

    }
}

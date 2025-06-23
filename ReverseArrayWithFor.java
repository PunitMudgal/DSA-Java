import java.util.Arrays;

public class ReverseArrayWithFor {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15 };
        reverseIntArray(arr);
        reverseIntArray2(arr);
    }

    static void reverseIntArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    static void reverseIntArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { // for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

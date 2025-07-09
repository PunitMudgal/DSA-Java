package Easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = { 18, 18, 18, 18, 18, 18 };

        System.out.println("Second Largest Elem: " + FindElem(arr));
    }

    static int FindElem(int[] arr) {
        int largest = -1;
        if (arr.length <= 1)
            return largest;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] != arr[i - 1])
                return largest = arr[i - 1];
        }
        return largest;
    }
}
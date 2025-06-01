// pattern to identify cyclic sort qustion is that the question will be given an array from 1 to n || 0 to n like - [1,5,4,3,6,2] -> given array 1 to 6;

package cyclic_sort;

import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println("while loop called");
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
            if (arr[i] == arr[correct])
                i = i + 1;
        }
    }
}

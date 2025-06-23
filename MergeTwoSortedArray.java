import java.util.Arrays;

class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 5, 7, 9 };
        int[] arr2 = { 2, 3, 6, 8 };
        mergeSortedArray(arr1, 5, arr2, 4);
    }

    static void mergeSortedArray(int[] arr1, int n, int[] arr2, int m) {
        int[] arr3 = new int[m + n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] > arr2[j]) {
                    // int temp = arr1[i];
                    arr3[i] = arr2[j];
                    // arr2[j] = arr1[i];
                } else {
                    arr3[i] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
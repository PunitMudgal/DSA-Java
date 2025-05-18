
// here the question is you are given an array but you don't know whether the given array is sorted in ascending or descending order

package Binary_search;

public class problem2 {
    public static void main(String[] args) {
        int[] arr = { 50, 44, 40, 35, 30, 25, 20, 10, 5, 1 };
        int result = binarySearchAlgo(44, arr);
        System.out.println("the result is: " + result);
    }

    static int binarySearchAlgo(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];
        System.out.println("is ascending: " + isAscending);

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAscending) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }
}

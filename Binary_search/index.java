package Binary_search;

public class index {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 8, 10, 13, 15, 18, 20 };
        int result = binarySearchAlgo(12, arr);
        System.out.println("the result is: " + result);
    }

    static int binarySearchAlgo(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // System.out.println("start: " + start + " end: " + end);
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else
                end = middle - 1;

        }
        return -1; // when target is not found
    }
}

//! not complete
package recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println("Answer: " + BinarySearchWithRecursion(arr, 3, 0, arr.length - 1));
    }

    static int BinarySearchWithRecursion(int[] arr, int target, int s, int e) {
        int mid = s + (e - s) / 2;
        if (s > e)
            return -1;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > arr[mid + 1]) {
            if (target > arr[s]) {
                e = mid - 1;
            } else
                s = mid + 1;
        } else {

        }
        return BinarySearchWithRecursion(arr, target, s + 1, e - 1);
    }
}

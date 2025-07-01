package recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 54, 23, 44, 55, 66, 77, 77 };
        // System.out.println(FindIfSorted(arr, 0));
        System.out.println(FindIfSorted2(arr, 0));
    }

    static boolean FindIfSorted(int[] arr, int i) {
        if (i < arr.length - 2 && arr[i] <= arr[i + 1]) {
            return FindIfSorted(arr, i + 1);
        }
        if (arr[i] > arr[i + 1])
            return false;
        return true;
    }

    // optimized solution
    static boolean FindIfSorted2(int[] arr, int i) {
        if (i == arr.length - 1)
            return true; // base case
        if (arr[i] > arr[i + 1])
            return false;
        return FindIfSorted2(arr, i + 1);
    }
}

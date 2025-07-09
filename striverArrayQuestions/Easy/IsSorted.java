package Easy;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 18, 1 };
        System.out.println("Is sorted: " + CheckSorted(arr));
    }

    static boolean CheckSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

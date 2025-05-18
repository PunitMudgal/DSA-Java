// we need to find a smallest number that is greater than or equal to the target number
package Binary_search;

public class ceilingNo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int answer = findNumber(6, arr);
        System.out.println("the answer is: " + answer);
    }

    static int findNumber(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end])
            return arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}

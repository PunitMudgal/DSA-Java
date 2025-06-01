// find the rotation count of the rotated array (Geeks for Geeks question)

package Binary_search;

public class RoratedArrayRotationCount {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 5, 6, 0, 3, 1 };
        int pivot = searchPivot(nums);

        System.out.println("total times array is rotated: " + (pivot + 1));

    }

    public static int searchPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1] && mid < end) {
                return mid;

            } else if (nums[mid] < nums[mid - 1] && mid > start) {
                return mid - 1;
            } else if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else if (nums[mid] < nums[start]) {
                end = mid - 1;
            }
        }
        return -1;
    }

}

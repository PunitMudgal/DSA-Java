// https://leetcode.com/problems/search-in-rotated-sorted-array/ 

package Binary_search;

public class FindInRotatedArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 5, 6, 0, 3, 1 };
        int target = 3;
        int pivot = searchPivot(nums);
        System.out.println("pivot: " + pivot);

        int result;
        result = findTargetValue(nums, 0, pivot, target);
        if (result != -1)
            System.out.println("Answer: " + result);
        else {
            result = findTargetValue(nums, pivot + 1, nums.length - 1, target);
            System.out.println("Answer: " + result);
        }
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

    static int findTargetValue(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

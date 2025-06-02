// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

package cyclic_sort;

public class DisappearedNo {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        find(nums);

    }

    static void find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else
                i = i + 1;
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[i]);
        }
    }
}

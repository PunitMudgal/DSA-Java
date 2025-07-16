// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        duplicates(arr);
    }

    static int duplicates(int[] nums) {
        int left = 0; // created a pointer to keep track of unique elements till this position
        for (int i = 1; i < nums.length; i++) { // started loop from 2nd position as 1st position will always be unique
            if (nums[i] != nums[i - 1]) { // if unique add it next to left pointer and update left pointer
                nums[left + 1] = nums[i];
                left++;
            }
        }
        return left + 1; // we have to return total uniques so add one to left pointer
    }
}

// simple answer we have to modify array and return number of uniques
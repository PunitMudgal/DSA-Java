
// ! incomplete
package Easy;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println("New array: " + duplicates(arr));
    }

    static int duplicates(int[] nums) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newArray.add(nums[i]);
            }
            if (i == nums.length - 2 && nums[i] != nums[i + 1]) {
                newArray.add(nums[i + 1]);
            }
        }
        return newArray.size();

    }
}

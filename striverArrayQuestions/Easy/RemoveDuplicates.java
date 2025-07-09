package Easy;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("New array: " + duplicates(arr));
    }

    static ArrayList<Integer> duplicates(int[] nums) {
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newArray.add(nums[i]);
            }
            if (i == nums.length - 2 && nums[i] != nums[i + 1]) {
                newArray.add(nums[i + 1]);
            }
        }
        return newArray;

    }
}

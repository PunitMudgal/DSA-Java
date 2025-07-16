// https://leetcode.com/problems/shuffle-the-array/description/

package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        System.out.println(suffle(arr, n));
    }

    static ArrayList<Integer> suffle(int[] nums, int n) {
        int mid = nums.length / 2;

        ArrayList<Integer> suffeledArray = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            suffeledArray.add(nums[i]);
            suffeledArray.add(nums[n]);
            n++;
        }
        return suffeledArray;
    }
}

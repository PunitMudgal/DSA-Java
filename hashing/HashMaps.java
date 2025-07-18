//todo https://leetcode.com/problems/contains-duplicate/description/

package hashing;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 2, 6 };
        System.out.println("Duplicates: " + checkDuplicates(arr));
        ;
    }

    static HashMap<Integer, Boolean> Isduplicates = new HashMap<>();

    static boolean checkDuplicates(int[] nums) {
        if (nums.length <= 1)
            return false;
        for (int num : nums) {
            System.out.println("num: " + num);
            if (Isduplicates.containsKey(num))
                return true;
            else {
                Isduplicates.put(num, true);
            }
        }
        return false;
    }
}

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// todo: find first and last occurence of the target in the array

package Binary_search;

public class FindFirst_LastPos {
    public static void main(String[] args) {
        int[] characters = { 5, 7, 7, 8, 8, 10 };
        // int target = 8;
        int[] answer = findNum(characters, 8);
        System.out.println("Answer is: " + answer[0] + " " + answer[1]);
    }

    static int[] findNum(int[] nums, int target) {
        int[] answer = { -1, -1 };

        answer[0] = findSingleNum(nums, target, true);

        if (answer[0] != -1)
            answer[1] = findSingleNum(nums, target, false);

        return answer;
    }

    static int findSingleNum(int[] nums, int target, boolean isFirst) {
        int postition = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                postition = mid;
                if (isFirst) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return postition;
    }
}

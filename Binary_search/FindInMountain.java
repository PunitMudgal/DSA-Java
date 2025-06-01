// https://leetcode.com/problems/find-in-mountain-array/description/

package Binary_search;

public class FindInMountain {
    public static void main(String[] args) {
        int[] characters = { 5, 6, 7, 8, 10, 14, 19, 4, 3, 2, 1 };
        int target = 1;

        int peak = findPeak(characters);
        int answer = FindElem(characters, 0, peak, target, false);
        if (answer != -1)
            System.out.println("answer is: " + answer);

        else {
            int answer2 = FindElem(characters, peak + 1, characters.length - 1, target, true);
            System.out.println("answer is: " + answer2);
        }
    }

    // first find the peak of the mountain
    static int findPeak(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            }
        }
        return s;

    }

    // * */ secondHalf changes the algo because its descendingly sorted
    static int FindElem(int[] nums, int start, int end, int target, boolean isDescending) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            if (!isDescending) {
                if (nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;

            } else {

                if (nums[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }

        return -1;
    }

}

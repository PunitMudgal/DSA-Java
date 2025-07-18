// given array = {1,2,4,5,6,7};
// sum them  = {1,3,7,12,18,15};

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSum {

    // !from neetcode
    List<Integer> prefix;

    public PrefixSum(int[] nums) {
        prefix = new ArrayList<>();
        int total = 0;
        for (int n : nums) {
            total += n;
            prefix.add(total);
        }
    }

    public int rangeSum(int left, int right) {
        int preRight = prefix.get(right);
        int preLeft = left > 0 ? prefix.get(left - 1) : 0;
        return (preRight - preLeft);
    }

    // ! my code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] result = findPrefixSum(arr);
        System.out.println(Arrays.toString(result));

        System.out.println("With O(1) space complexity: " + Arrays.toString(findPrefix(arr)));

    }

    // this solution will create new array
    static int[] findPrefixSum(int[] originalArr) {
        int[] sums = new int[originalArr.length];
        sums[0] = originalArr[0];

        for (int i = 1; i < originalArr.length; i++) {
            sums[i] = sums[i - 1] + originalArr[i];
        }
        return sums;
    }

    // to do this in O(1) space complexity and modify original array
    static int[] findPrefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}

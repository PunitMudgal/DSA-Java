// https://leetcode.com/problems/missing-number/description/

package cyclic_sort;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 4 };

        int returnedNUm = sort(arr);
        System.out.println("answer is: " + returnedNUm);
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println("while loop called");
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else
                i = i + 1;

        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }
        return arr.length;
    }
}

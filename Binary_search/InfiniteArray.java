// todo find position of the element in the infinite array (you can't use array.length)
// *solved it myself
package Binary_search;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] characters = { 5, 7, 8, 10, 12, 14, 15, 16, 17, 18, 20, 22, 25, 26, 27, 28 };

        int answer = findNum(characters, 27);
        System.out.println("Answer is: " + answer);
    }

    static int findNum(int[] nums, int target) {

        int s = 0;
        int e = 1;

        while (nums[e] < target) {
            int newStart = e + 1;
            e = e + (e - s + 1) * 2; // double
            s = newStart;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }
}

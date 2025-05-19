// todo https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

package Binary_search;

public class MountainArray {
    public static void main(String[] args) {
        int[] characters = { 5, 6, 7, 8, 10, 14, 19, 4, 3, 2, 1 };
        // int[] characters = { 4, 3, 2, 1 };

        int answer = findNum(characters);
        int answer2 = findNum2(characters);
        System.out.println("Answer1 is: " + answer);
        System.out.println("Answer2 is: " + answer2);
    }

    // 1st solution (mine)
    static int findNum(int[] arr) {

        int s = 0;
        int e = arr.length - 1;
        int biggestElement = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid - 1]) {
                biggestElement = mid;
                s = mid;
            } else {
                biggestElement = mid - 1;
                e = mid - 1;
            }
            if (arr[mid] > arr[mid + 1]) {
                biggestElement = mid;
                e = mid;
            } else {
                biggestElement = mid + 1;
                s = mid + 1;
            }
            if (s == biggestElement && e == biggestElement) {
                return biggestElement;
            }
        }

        return biggestElement;
    }

    // 2nd solution from leetcode
    static int findNum2(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            }
        }
        return s;
    }
}

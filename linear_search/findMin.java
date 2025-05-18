// find minimum number using linear search algorithm

package linear_search;

public class findMin {
    public static void main(String[] args) {
        int[] arr = { 21, 23, 4, 5, 65, 65, 76, 34, 534, 543, 234, 2, 1 };

        System.out.println("the min number is: " + minNumAlgo(arr));
    }

    static int minNumAlgo(int[] arr) {

        int minNum = 0;
        for (int index = 0; index < arr.length - 1; index++) {

            if (arr[index] < arr[index + 1]) {
                minNum = arr[index];
            } else {
                minNum = arr[index + 1];
            }
        }
        return minNum;
    }
}

// search element in 2d array

package Binary2dArray;

import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 39, 49 },
                { 33, 34, 38, 50 },
        };
        System.out.println(Arrays.toString(searchElem(arr, 35)));
    }

    static int[] searchElem(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            if (matrix[row][col] > target) {
                col = col - 1;
            } else
                row = row + 1;
        }
        return new int[] { -1, -1 };
    }
}

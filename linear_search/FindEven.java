// find total no. of even number in array 

package linear_search;

public class FindEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6, 34, 7 };
        int result = findEven(arr);
        System.out.println("total evnen number in the array: " + result);
    }

    static int findEven(int[] arr) {
        int totalEvens = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 == 0) {
                totalEvens++;
            }
        }
        return totalEvens;
    }
}

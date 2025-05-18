package linear_search;

public class intSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 434, 454, 43, 23, 4, 5, 6 };
        int target = 4;
        int answer = linearSearchAlg(arr, target);
        System.out.println("the result is: " + answer);
    }

    static int linearSearchAlg(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {

            int elem = arr[index];
            if (elem == target)
                return index;
        }
        return -1;
    }
}
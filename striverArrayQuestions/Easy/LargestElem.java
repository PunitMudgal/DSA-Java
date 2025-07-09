package Easy;

public class LargestElem {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 13, 6, 7, 18 };
        System.out.println("Largest Elem: " + FindElem(arr));
    }

    static int FindElem(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

package string;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String[] arr = { "k", "h", "u", "s", "h", "i" };
        String[] rsvStr = reverseThisArray(arr);
        System.out.println(Arrays.toString(rsvStr));
    }

    static String[] reverseThisArray(String[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            System.out.println("No. of times loop ran: " + (s + 1));
            String temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s = s + 1;
            e = e - 1;
        }
        return arr;
    }
}

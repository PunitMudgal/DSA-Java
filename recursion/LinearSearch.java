package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 6, 3, 1 };
        ArrayList<Integer> occurences = new ArrayList<>();
        System.out.println("1st Function: " + LinearSearchRecursion(arr, 1, 0));
        System.out.println("2nd Function: " + FindAllOccurances(arr, 1, 0, occurences));
        System.out.println("3rd Function: " + FindAllOccurancesWithoutArguments(arr, 1, 0));
    }

    static int LinearSearchRecursion(int[] arr, int target, int s) {
        if (s > arr.length - 1)
            return -1;
        if (arr[s] == target) {
            return s;
        }
        return LinearSearchRecursion(arr, target, s + 1);
    }

    // todo find all index of target
    static ArrayList<Integer> FindAllOccurances(int[] arr, int target, int s, ArrayList<Integer> occurences) {
        if (s > arr.length - 1)
            return occurences;
        if (arr[s] == target) {
            occurences.add(s);
        }
        return FindAllOccurances(arr, target, s + 1, occurences);
    }

    // todo find all index (occurences) of target but don't pass ArrayList in
    // arguments
    static ArrayList<Integer> FindAllOccurancesWithoutArguments(int[] arr, int target, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        if (s > arr.length - 1)
            return list;
        if (arr[s] == target) {
            list.add(s);
        }

        ArrayList<Integer> newList = FindAllOccurancesWithoutArguments(arr, target, s + 1);
        list.addAll(newList);
        return list;
    }
}

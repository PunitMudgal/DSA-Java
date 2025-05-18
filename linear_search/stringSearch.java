package linear_search;

public class stringSearch {
    public static void main(String[] args) {
        String name = "punitsharma";
        char target = 's';
        int result = linearSearchString(name, target);
        System.out.println("target is: " + result);
    }

    static int linearSearchString(String name, char target) {
        for (int index = 0; index < name.length(); index++) {
            if (name.charAt(index) == target)
                return index;
        }
        return -1;
    }
}

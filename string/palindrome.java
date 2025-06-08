package string;

public class palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        String str2 = "racecar";
        String str3 = null;
        boolean answer = isPalindrome(str3);
        System.out.println("Answer: " + answer);
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 0)
            return false;
        int s = 0;
        int e = str.length() - 1;
        // edge case
        while (s <= e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else
                return false;
        }
        return true;
    }

}

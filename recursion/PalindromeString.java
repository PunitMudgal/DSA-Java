package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar";
        // boolean isPalindrome = palindromeChecker(str, 0, str.length() - 1);
        boolean Answer2 = isPalindrome2("A man, a plan, a canal: Panama");
        System.out.println(Answer2);
        // System.out.println("answer: " + isPalindrome);
    }

    static boolean palindromeChecker(String str, int s, int e) {
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        if (str.charAt(s) == str.charAt(e) && s <= e)
            palindromeChecker(str, s + 1, e - 1);
        return true;

    }

    // ! we can also write like this (more clean version)
    static boolean palindromeChecker2(String str, int s, int e) {
        if (s >= e)
            return true; // means has checked all the string position that it reached at this pos where s
                         // became >= e
        if (str.charAt(s) != str.charAt(e))
            return false;
        return palindromeChecker2(str, s + 1, e - 1);
    }

    // using loop
    static boolean isPalindrome2(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("newStr: " + newStr);
        if (newStr.length() <= 0)
            return true;
        int start = 0;
        int end = newStr.length() - 1;
        while (start <= end) {
            if (newStr.charAt(start) == newStr.charAt(end)) {
                start = start + 1;
                end = end - 1;
            } else {
                return false;
            }
        }
        return true;
    }
}

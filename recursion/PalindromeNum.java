package recursion;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 23432;
        int anotherNum = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        isPalindome(anotherNum, count, 0);
    }

    static int newNum;

    static boolean isPalindome(int num, int count, int total) {
        int mid = count / 2;
        if (num == 0) {
            return true;
        }
        int rem = num % 10;
        total = total * 10 + rem;
        return isPalindome(num / 10, count, total);
    }
}

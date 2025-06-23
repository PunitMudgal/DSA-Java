package recursion;

public class AddDigits {
    public static void main(String[] args) {
        int num = 1234;
        // int result = AddAllDigits(num, 0);
        int result2 = AddAllDigits2(num);
        System.out.println("Answer: " + result2);
    }

    static int AddAllDigits(int num, int total) {

        if (num == 0) {
            return total;
        }
        int rem = num % 10; // gives last element
        total = total + rem;
        num = num / 10; // removes last element coz num is int
        return AddAllDigits(num, total);
    }

    // 2nd answer using recursion
    static int AddAllDigits2(int num) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        num = num / 10;
        return rem + AddAllDigits2(num);
    }
}
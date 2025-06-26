package recursion;

public class CountZeros {
    public static void main(String[] args) {
        int num = 10;
        count(num);

    }

    static int zeros;

    static void count(int num) {
        if (num == 0) {
            System.out.println(zeros);
            return;
        }

        int rem = num % 10;
        if (rem == 0)
            zeros++;
        count(num / 10);
    }
}

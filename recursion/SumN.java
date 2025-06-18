package recursion;

public class SumN {
    public static void main(String[] args) {

        printNTimes(11, 0);
        int answer = sumOfN(5);
        System.out.println(answer);

    }

    static void printNTimes(int n, int totalSum) {
        if (n == 0) {
            System.out.println(totalSum);
            return;
        }
        totalSum = totalSum + n;
        printNTimes(n - 1, totalSum);

    }

    // we can also do like this this below aproach is more like recursion as
    // compared to above
    static int sumOfN(int n) {
        if (n <= 0)
            return 0;
        return n + sumOfN(n - 1);
    }
}
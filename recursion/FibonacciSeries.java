package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.println(firstNum + " ");
        System.out.println(secondNum + " ");
        printFibonacciSeries(5, 0, 1);
    }

    static void printFibonacciSeries(int n, int firstNum, int secondNum) {
        if (n < 3)
            return;
        int nextNum = firstNum + secondNum;
        System.out.println(nextNum + " ");
        printFibonacciSeries(n - 1, secondNum, nextNum);
    }
}

package recursion;

public class FactorialOfN {

    public static void main(String[] args) {

        int factOfN = factorialN(5);
        System.out.println("Answer: " + factOfN);

    }

    static int factorialN(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialN(n - 1);

    }
}
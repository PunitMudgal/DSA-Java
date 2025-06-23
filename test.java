public class test {
    public static void main(String[] args) {
        rec(5);
    }

    static void rec(int n) {
        if (n == 0) {
            return;
        }
        rec(n - 1);
        System.out.println(n);
    }
}

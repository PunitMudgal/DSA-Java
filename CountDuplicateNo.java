public class CountDuplicateNo {
    public static void main(String[] args) {
        int a = 3232323;
        int count = 0;

        while (a > 0) {
            int rem = a % 10;
            if (rem == 3)
                count += 1;
            a = a / 10;
        }
        System.out.println(count);
    }
}

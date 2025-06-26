package recursion;

public class ReverseANum {
    public static void main(String[] args) {
        int num = 654654;
        int result = ReverseNum(num, 0);
        System.out.println(result);
    }

    static int ReverseNum(int num, int reversed) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        return reversed * 10 + rem + ReverseNum(num / 10, reversed);
    }
}

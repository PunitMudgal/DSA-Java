public class ReverseInteger {
    public static void main(String[] args) {
        int a = 2138;
        // int reverse ;

        while (a > 0) {
            int lastWord = a % 10;
            System.out.print(lastWord);
            a = a / 10;
        }

        // if you want to store the value in a variable instead of just printing

        int num = 2343;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println("Reverse number is: " + reverse);
    }
}

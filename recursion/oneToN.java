package recursion;

import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("enter no. you want it to print");

        int num = takeInput.nextInt();
        takeInput.close(); // remove memory leak warning from scanner
        printNTimes(num, 1);
    }

    static void printNTimes(int n, int totalTimes) {
        if (totalTimes > n)
            return;
        System.out.print(totalTimes + " ");
        printNTimes(n, totalTimes + 1);
    }
}

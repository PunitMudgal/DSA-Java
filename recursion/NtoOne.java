package recursion;

import java.util.Scanner;

public class NtoOne {

    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("enter no. you want it to print");

        int num = takeInput.nextInt();
        takeInput.close(); // removes memory leak warning from scanner
        printNTimes(num);
    }

    static void printNTimes(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNTimes(n - 1);
    }
}

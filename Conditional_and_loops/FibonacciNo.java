package Conditional_and_loops;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers you want to print: ");
        int n = inputNum.nextInt();

        // Edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (n == 1) {
            System.out.println(num1);
        } else {
            System.out.print(num1 + ", " + num2);
            for (int i = 2; i < n; i++) {
                int sum = num1 + num2;
                System.out.print(", " + sum);
                num1 = num2;
                num2 = sum;
            }
        }
    }
}

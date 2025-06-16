// print name N times using recrusion

package recursion;

import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("enter name & no. of times you want it to print");

        String name = takeInput.nextLine();
        int num = takeInput.nextInt();
        takeInput.close();
        printNTimes(name, num);
    }

    static void printNTimes(String name, int n) {
        if (n == 0)
            return;
        System.out.println(name);
        printNTimes(name, n - 1);
    }
}

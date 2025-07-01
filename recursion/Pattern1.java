/**
 ****
 ***
 **
 *
 */
package recursion;

public class Pattern1 {
    public static void main(String[] args) {
        printPattern(0, 4);
    }

    static void printPattern(int i, int j) {
        if (j == 0)
            return;

        if (i < j) {
            System.out.print("* ");
            printPattern(i + 1, j);
        } else {
            System.out.println();
            printPattern(0, j - 1);
        }
    }
}

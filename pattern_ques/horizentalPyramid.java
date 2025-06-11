/**
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
package pattern_ques;

public class horizentalPyramid {
    public static void main(String[] args) {
        int nums = 6;
        for (int i = 0; i <= nums; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = nums; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

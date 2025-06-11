/**
         *
        **
       ***
      ****
     *****
 */

package pattern_ques;

public class RightHalfPyramid {
    public static void main(String[] args) {
        int nums = 6;
        for (int i = 0; i <= nums; i++) {
            // print spaces
            for (int j = 1; j <= nums - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

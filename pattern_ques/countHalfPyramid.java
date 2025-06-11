/**
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */

package pattern_ques;

public class countHalfPyramid {
    public static void main(String[] args) {
        int nums = 6;
        for (int i = 0; i <= nums; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

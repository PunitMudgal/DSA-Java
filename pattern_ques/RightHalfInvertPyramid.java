package pattern_ques;

public class RightHalfInvertPyramid {
    public static void main(String[] args) {
        int nums = 6;
        for (int i = 0; i <= nums; i++) {

            // print stars
            for (int k = nums; k <= i; k++) {
                System.out.print("*");
            }

            // print spaces
            for (int j = 1; j <= nums - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

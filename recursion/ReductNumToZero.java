// todo https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

package recursion;

public class ReductNumToZero {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(countSteps(num, 0));
    }

    static int countSteps(int num, int steps) {
        if (num == 0)
            return steps;
        if (num % 2 == 0) {
            num = num / 2;
            steps++;
            return countSteps(num, steps);
        } else {
            num = num - 1;
            steps++;
            return countSteps(num, steps);
        }
    }
}

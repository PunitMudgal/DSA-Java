// todo  https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// find smallest character that is greater than the target (note: 

// 1. the no. shouldn't be equal to the target 
// 2. the if numbter exceedest the result  should be first character

package Binary_search;

public class CharCeiling {
    public static void main(String[] args) {
        char[] characters = { 'A', 'C', 'F', 'J', 'N', 'R', };
        char target = 'A';
        char answer = findCeiling(characters, target);
        System.out.println("Answer is: " + answer);
    }

    static char findCeiling(char[] chars, char target) {
        int s = 0;
        int e = chars.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (chars[mid] <= target) {
                s = mid + 1;
            } else
                e = mid - 1;
        }
        return chars[s % chars.length];
    }

}

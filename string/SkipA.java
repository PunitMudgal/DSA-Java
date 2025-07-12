// skip character a with recursion
// example: str: "baccad"
// output: "bccd"

package string;

public class SkipA {
    public static void main(String[] args) {
        skipCharacter("what the hack", "", 0);
    }

    static void skipCharacter(String str, String newStr, int i) {
        if (str.isEmpty()) {
            System.out.println("New String: " + newStr);
            return;
        }
        if (str.charAt(i) == 'a') {
            skipCharacter(str.substring(1), newStr, i++);
        } else {
            skipCharacter(str.substring(1), newStr + str.charAt(i), i);
        }
    }

    // solution 2: if you need to return that string
    static String skipCharacter2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return skipCharacter2(str.substring(1));
        } else {
            return ch + skipCharacter2(str.substring(1));
        }
    }
}

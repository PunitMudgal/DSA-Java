package string;

public class SkipWord {
    public static void main(String[] args) {
        skipCharacter("what apple hack");
    }

    static void skipCharacter(String str) {
        if (!str.contains("apple")) {
            System.out.println("String doesn't contain the word ");
            return;
        }
        str.replace("apple", "");
        System.out.println(str);
        return;
        // if () {
        // skipCharacter(str.substring(1));
        // } else {
        // skipCharacter(str.substring(1));
    }
}

package Easy;

public class Length_of_last_word {
//    Example 1:
//
//    Input: s = "Hello World"
//    Output: 5
//    Explanation: The last word is "World" with length 5.
//    Example 2:
//
//    Input: s = "   fly me   to   the moon  "
//    Output: 4
//    Explanation: The last word is "moon" with length 4.
//    Example 3:
//
//    Input: s = "luffy is still joyboy"
//    Output: 6
//    Explanation: The last word is "joyboy" with length 6.
    static public int lengthOfLastWord(String s) {
        int index = s.length() -1;
        int i;

        if (s.charAt(s.length() -1) == ' ') {
            while (s.charAt(index) == ' ') {
                index--;
            }
        }
        for ( i = 0; index >= 0 && s.charAt(index) != ' '; i++, index--) {

        }

        return i;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

}

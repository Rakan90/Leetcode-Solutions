package Easy;

public class Length_of_last_word {
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

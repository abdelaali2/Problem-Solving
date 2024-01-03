package LengthOfLastWord;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();

        int lastSpaceIndex = trimmedString.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return trimmedString.length();
        } else {
            return trimmedString.length() - lastSpaceIndex - 1;
        }
    }
}

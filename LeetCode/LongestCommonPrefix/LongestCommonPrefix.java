package LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1)
            return strs[0];
        String _1stWord = strs[0];
        String _2ndWord = strs[1];
        StringBuffer prefix = new StringBuffer("");

        for (int i = 0; i < _2ndWord.length(); i++) {
            if (i < _1stWord.length()) {
                char _1stWordChar = _1stWord.charAt(i);
                char secondWordChar = _2ndWord.charAt(i);

                if (_1stWordChar == secondWordChar) {
                    prefix.append(_1stWordChar);
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        for (int i = 2; i < strs.length; i++) {
            String currentWord = strs[i];
            if (!currentWord.startsWith(prefix.toString())) {
                while (!currentWord.startsWith(prefix.toString())) {
                    prefix.deleteCharAt(prefix.length() - 1);
                }
            }
        }

        return prefix.toString();
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        final String[] array = { "flower", "flow", "flight" };

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(array));
    }
}

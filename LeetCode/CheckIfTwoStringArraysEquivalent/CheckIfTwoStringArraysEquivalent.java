package CheckIfTwoStringArraysEquivalent;

public class CheckIfTwoStringArraysEquivalent {
    public static void main(String[] args) {
        System.out.println(new Solution().arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var sb1 = new StringBuffer();
        var sb2 = new StringBuffer();

        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}

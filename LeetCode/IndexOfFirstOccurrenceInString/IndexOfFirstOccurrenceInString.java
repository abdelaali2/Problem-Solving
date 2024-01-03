package IndexOfFirstOccurrenceInString;

public class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("Needle", "l"));
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        var sb = new StringBuffer(haystack);
        return sb.indexOf(needle);
    }
}

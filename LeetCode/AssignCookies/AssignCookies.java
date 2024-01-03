package AssignCookies;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(new Solution().findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 }));
    }
}

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length & j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i;
    }
}

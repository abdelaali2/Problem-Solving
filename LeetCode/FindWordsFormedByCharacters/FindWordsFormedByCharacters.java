package FindWordsFormedByCharacters;

public class FindWordsFormedByCharacters {
    public static void main(String[] args) {
        System.out.println(new Solution().countCharacters(new String[] { "cat", "bt", "hat", "tree" }, "atach"));
    }
}

class Solution {
    public int countCharacters(String[] words, String chars) {
        int count[] = new int[26];
        int ans = 0;
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i) - 'a']++;
        }
        for (String p : words) {
            if (counter(p, count)) {
                ans += p.length();
            }
        }
        return ans;

    }

    public boolean counter(String a, int[] count) {
        int c[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i) - 'a';
            c[b]++;
            if (c[b] > count[b]) {
                return false;
            }
        }

        return true;

    }
}

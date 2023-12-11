package PalindromeNumber;

class Solution1 {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        StringBuilder builder = new StringBuilder(string).reverse();
        return string.equals(builder.toString());
    }
}

class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return false;
            }
            reversed = reversed * 10 + digit;
        }
        return original == reversed;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        boolean result1 = s1.isPalindrome(56765);
        System.out.format("result %s\n", result1);

        Solution2 s2 = new Solution2();
        boolean result2 = s2.isPalindrome(56765);
        System.out.format("result2 %s\n", result2);
    }
}

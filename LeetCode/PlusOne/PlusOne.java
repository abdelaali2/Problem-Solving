package PlusOne;

public class PlusOne {
    public static void main(String[] args) {
        for (int num : new Solution().plusOne(new int[] { 1, 2, 3 })) {
            System.out.println(num);
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        digits[n - 1] += 1;

        for (int i = n - 1; i > 0 && digits[i] > 9; i--) {
            digits[i] %= 10;
            digits[i - 1] += 1;
        }

        if (digits[0] > 9) {
            int[] result = new int[n + 1];
            result[0] = 1;
            result[1] = digits[0] % 10;
            System.arraycopy(digits, 1, result, 2, n - 1);
            return result;
        }

        return digits;
    }
}

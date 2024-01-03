public class Challenge3Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfBeams(new String[] { "011001", "000000", "010100", "001000" }));
    }
}

class Solution {
    public int numberOfBeams(String[] bank) {
        int beamsCount = 0;
        int prevOnes = 0;

        for (String row : bank) {
            int ones = onesCounter(row);
            if (0 == ones) {
                continue;
            }
            beamsCount += prevOnes * ones;
            prevOnes = ones;
        }
        return beamsCount;
    }

    private int onesCounter(String binary) {
        int count = 0;
        for (char digit : binary.toCharArray()) {
            count += digit - '0';
        }
        return count;
    }
}

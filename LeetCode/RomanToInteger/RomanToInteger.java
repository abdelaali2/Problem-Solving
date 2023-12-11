package RomanToInteger;

class Solution {
    public int romanToInt(String s) {
        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;

        int value = 0;

        char[] letters = s.toCharArray();

        for (int j = 0; j < letters.length; j++) {
            char currentLetter = letters[j];

            switch (currentLetter) {
                case 'M':
                    value += M;
                    break;
                case 'D':
                    value += D;
                    break;
                case 'L':
                    value += L;
                    break;
                case 'V':
                    value += V;
                    break;
                case 'I':
                    if (j == letters.length - 1) {
                        value += I;
                    } else {
                        char nextLetter = letters[j + 1];
                        if (nextLetter == 'V' || nextLetter == 'X') {
                            value -= I;
                        } else {
                            value += I;
                        }
                    }
                    break;
                case 'X':
                    if (j == letters.length - 1) {
                        value += X;
                    } else {
                        char nextLetter = letters[j + 1];
                        if (nextLetter == 'L' || nextLetter == 'C') {
                            value -= X;
                        } else {
                            value += X;
                        }
                    }
                    break;
                case 'C':
                    if (j == letters.length - 1) {
                        value += C;
                    } else {
                        char nextLetter = letters[j + 1];
                        if (nextLetter == 'D' || nextLetter == 'M') {
                            value -= C;
                        } else {
                            value += C;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return value;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("XII should return 12, ==>" + solution.romanToInt("XII"));
        System.out.println("XXI should return 21, ==>" + solution.romanToInt("XXI"));
        System.out.println("XCIX should return 99, ==>" + solution.romanToInt("XCIX"));
        System.out.println("CDXLIV should return 444, ==>" + solution.romanToInt("CDXLIV"));
        System.out.println("CMXCIV should return 994, ==>" + solution.romanToInt("CMXCIV"));
        System.out.println("MMCDXLIV should return 2444, ==>" + solution.romanToInt("MMCDXLIV"));
        // System.out.println("MMMCMXC should return 3990, ==>" +
        // solution.romanToInt("MMMCMXC"));
        // System.out.println("MMMCMXCIX should return 3999, ==>" +
        // solution.romanToInt("MMMCMXCIX"));
        System.out.println("MMMCMXLVIII should return 3948, ==>" + solution.romanToInt("MMMCMXLVIII"));
        System.out.println("DCCCLXXXVIII should return 888, ==>" + solution.romanToInt("DCCCLXXXVIII"));
    }
}

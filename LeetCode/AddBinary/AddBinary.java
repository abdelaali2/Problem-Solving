package AddBinary;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11", "1"));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger sum = x.add(y);

        return sum.toString(2);
    }
}

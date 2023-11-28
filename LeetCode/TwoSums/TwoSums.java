package LeetCode.TwoSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Solution 1: O(N^2)

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>(0);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] finalList = list.stream().mapToInt(Integer::intValue).toArray();
        return finalList;
    }
}

// Solution 2

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(nums[i], i);
        }

        return new int[] {};
    }
}

/**
 * TwoSums
 */
public class TwoSums {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] input = { 1, 4, 3, 2, 9 };
        int[] array = solution2.twoSum(input, 10);
        System.out.println(Arrays.toString(array));
    }
}
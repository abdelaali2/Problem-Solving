package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[] { 1, 1, 2 }));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // At least the first element is unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
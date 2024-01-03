package SearchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1])
            return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (nums[i] != target) {
                int diff = target - nums[i];
                if (diff < 0)
                    return i;
            }

        }

        return 0;
    }
}

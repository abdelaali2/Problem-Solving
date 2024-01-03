package LeetCode.Jan2024;
import java.util.ArrayList;
import java.util.List;

public class Challenge2Solution {
    public static void main(String[] args) {
        new Solution().findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 });
        System.out.format("new Solution().findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 }) %s\n",
                new Solution().findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 }));
    }
}

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        for (int num : nums) {
            boolean added = false;
            for (List<Integer> row : outerList) {
                if (!row.contains(num)) {
                    row.add(num);
                    added = true;
                    break;
                }
            }

            if (!added) {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                outerList.add(newRow);
            }
        }
        return outerList;
    }
}

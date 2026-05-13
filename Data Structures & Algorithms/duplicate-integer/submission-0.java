class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false; // No duplicates possible with 0 or 1 element
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start j from i+1 to avoid checking same element or (a,b) and (b,a)
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found after checking all pairs
    }
}
class Solution {
    public int maximumCount(int[] nums) {
        
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else {
                break;
            }
        }
        
        int pos = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                pos++;
            } else {
                break;
            }
        }
        
        return Math.max(neg, pos);
    }
}
class Solution {
    public int arraySign(int[] nums) {
        int acc = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            
            if (num < 0) {
                acc++;
            }
        }
        
        if (acc % 2 == 1) {
            return -1;
        }
        
        return 1;
    }
}
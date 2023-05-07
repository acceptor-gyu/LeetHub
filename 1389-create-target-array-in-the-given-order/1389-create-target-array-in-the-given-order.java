class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int length = nums.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (index[j] >= index[i]) {
                    index[j]++;
                }
            }
        }
        
        for (int i = 0; i < length; i++) {
            answer[index[i]] = nums[i];
        }
        
        return answer;
    }
}
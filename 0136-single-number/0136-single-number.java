import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }
        
        int answer = 0;
        
        for (Integer num : numSet) {
            answer = num;
        }
        
        return answer;
    }
}
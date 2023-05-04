class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int eachNum = Character.getNumericValue(n.charAt(i));
            if (eachNum > max) {
                max = eachNum;
            }
        }
        
        return max;
        
    }
}
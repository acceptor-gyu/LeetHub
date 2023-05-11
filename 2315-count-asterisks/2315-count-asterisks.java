class Solution {
    public int countAsterisks(String s) {
        
        int group = 0;
        int first = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '|') {
                group++;
            }
            
            if (group % 2 == 0 && c == '*') {
                first++;
            }
        }
        
        return first;
    }
}
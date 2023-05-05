class Solution {
    public int maxVowels(String s, int k) {
        char[] characters = s.toCharArray();
        
        int left = 0;
        int right = k - 1;
        int max = 0;
        
        for (int i = 0; i <= right; i++) {
            if (isVowel(characters[i])) {
                max++;
            }
        }
        
        int cnt = max;
        
        while (right < s.length() - 1) {
            if (isVowel(characters[left])) {
                cnt--;
            }
            
            if (isVowel(characters[right + 1])) {
                cnt++;
            }
            
            if (cnt > max) {
                max = cnt;
            }
            
            
            left++;
            right++;
        }
        
        return max;
    }
    
    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
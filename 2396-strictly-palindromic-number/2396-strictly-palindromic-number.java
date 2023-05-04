class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for (int i = 2; i <= n - 2; i++) {
            if (!baseMisPalindrome(i, n)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean baseMisPalindrome(int m, int n) {
    
        StringBuilder sb = new StringBuilder();
    
        while (n > 0) {
            int remainder = n % m;
            char c;
            
            if (remainder < 10) {
                c = (char) ('0' + remainder);
            } else {
                c = (char) ('A' + remainder - 10);
            }
            sb.append(c);
            n /= m;
        }
        
        return sb.toString().equals(sb.reverse().toString());
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String ori = String.valueOf(x);
        String reversed = new StringBuilder(ori).reverse().toString();

        return ori.equals(reversed);
    }
}
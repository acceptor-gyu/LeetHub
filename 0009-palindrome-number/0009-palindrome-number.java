class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int origin = x;
        long beawareOfOverflow = 0;

        while (x != 0) {
            beawareOfOverflow = beawareOfOverflow * 10 + x % 10;
            x = x / 10;
        }

        if ((int) beawareOfOverflow == origin) {
            return true;
        }

        return false;
    }
}
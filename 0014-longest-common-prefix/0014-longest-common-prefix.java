class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ACCUM = new StringBuilder(strs[0]);

        for (String str : strs) {
            int shortSize = Math.min(ACCUM.length(), str.length());

            if (ACCUM.length() > shortSize) {
                ACCUM.delete(shortSize, ACCUM.length());
            }

            for (int j = 0; j < shortSize; j++) {
                if (ACCUM.charAt(j) != (str.charAt(j))) {
                    ACCUM.delete(j, shortSize);
                    break;
                }
            }
        }

        return ACCUM.toString();
    }
}
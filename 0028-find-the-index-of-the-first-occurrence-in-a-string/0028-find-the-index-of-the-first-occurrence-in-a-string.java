class Solution {
    public int strStr(String haystack, String needle) {
        
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for (int i = 0; i < haystackArr.length - needleArr.length + 1; i++) {
            
            if (haystackArr[i] == needleArr[0]) {
                for (int j = 0; j < needleArr.length; j++) {
                    if (haystackArr[i + j] != needleArr[j]) {
                        break;
                    }
                    
                    if (j == needleArr.length - 1) {
                        return i;
                    }
                }
            }   
        }
        
        return -1;
    }
}
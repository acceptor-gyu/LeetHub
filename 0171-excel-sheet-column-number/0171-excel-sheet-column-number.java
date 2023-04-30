class Solution {
    public int titleToNumber(String columnTitle) {
        
        int answer = 0;
        int value = 1;
        char[] titles = columnTitle.toCharArray();

        for (int i = titles.length - 1; i >= 0; i--) {
            answer += (titles[i] - 'A' + 1) * value;
            value *= 26;
        }
        
        return answer;
    }
}
​ 
속도는 약간 느렸지만 메모리 효울성이 좋았던 코드
```java

class Solution {
    public int arraySign(int[] nums) {
        long acc = 1;
        
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            
            long temp = acc * num;
            
            acc = temp / Math.abs(temp);
        }
        
        return (int) (acc / Math.abs(acc));
    }
}
```

## 정수 n을 m진수로 변환하기
```java
private String convertIntegerNtoBaseM(int m, int n) {
    
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
        
    return sb.reverse().toString();
}
```

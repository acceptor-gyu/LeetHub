## char 타입 숫자(ex. '1')를 int 타입으로 변환
1.
```java
char charNum = '1';
int num = Character.getNumericValue(charNum);
```

2. 
```java
char charNum = '1';
int num = charNum - '0';
```

## 수행 시간 비교
```java
public class CharNumToInteger {

    public static void main(String[] args) {
        char charNum = '1';

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            int b = Character.getNumericValue(charNum);
        }
        System.out.println((long) (System.currentTimeMillis() - start) / 100.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            int a = charNum - '0';
        }
        System.out.println((long) (System.currentTimeMillis() - start) / 100.0);
    }
}
```

실행 결과  
0.04  
0.02  

약 2배 정도 차이가 날 수 있으므로 2번째 방법을 선택하는 것이 좋을 것이다.

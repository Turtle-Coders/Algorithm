# [First Bad Version]
```
Binary search를 활용

가장 작은 값과 큰 값의 중간을 탐색
중간값(mid)과 비교하여 검색대상을 반으로 줄임

처음에 low + high / 2 로 했으나 overflow 버그 발생

-> 해결책 low + (high - low) / 2 로 해야 overflow가 발생하지 않음

```

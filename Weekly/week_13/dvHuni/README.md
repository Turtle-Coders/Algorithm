##
# Shuffle an Array

## 시간 복잡도 분석
  - O(n)
  
## 문제 풀이
  - 셔플 방법 (440ms)
      1. 아이템수만큼의 인덱스 Array 만들기 (origin:[char] = [a,b,c,d] => [0,1,2,3])
      2. 인덱스 Array에서 랜덤으로 index를 꺼내오고, 해당 index는 Array에서 제거한다.
      3. 꺼낸 index로 아이템을 뽑아 Array로 만든다. (origin[꺼낸 index])
      4. 만들어진 Array return
  - Array.shuffle -> 320ms

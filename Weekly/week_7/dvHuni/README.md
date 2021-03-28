##
# FirstBadVersion

## 시간 복잡도 분석
  - O(logn)
  
## 문제 풀이
  - 이진 탐색을 활용하여 중간값을 비교, Left Side, Right Side 를 나누어 계속 중간값을 체크하여 해결

# OddEvenLinkedList

## 시간 복잡도 분석
  - 주어진 리스트의 노드 수 만큼 반복하므로, O(n)
  
## 문제 풀이
  - even리스트의 head를 저장하고, odd, even리스트의 next를 지정하며 odd, even리스트 완성 후,
  odd리스트의 next를 저장해둔 even리스트 head로 연결하여 해결

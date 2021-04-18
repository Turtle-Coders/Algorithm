##
# Group Anagrams

## 시간 복잡도 분석
  - O(n^2) : strs.map({ $0.sorted() }) 부분에서 map안에서 sort를 진행하므로 반복문 안의 반복문이기 때문.
    
## 문제 풀이
  - 이전에 anagram문제를 sort로 해결한적이 있어 이번문제도 sort를 통해 접근하였다.
  - sort를 진행한 배열의 항목들의 original 값들을 *tuple형태로 가지고있다가, groupping이 끝나면, original값을 꺼내는 방법으로 해결하였다.
  
  * tuple : Swift의 데이터 타입중 하나. HashMap과 다르게 특정 타입과 특정 타입을 묶어 하나의 타입으로 정의한다.
    ex) (String, Int)의 경우 ("안상훈", 950324)의 형태로 저장이 가능하다.
    
  - runtime이 평균 보다 많이 길다. 다른 분들의 풀이도 배워보자.
    

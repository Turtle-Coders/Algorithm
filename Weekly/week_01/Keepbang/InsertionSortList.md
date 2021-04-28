# 문제풀이

### Insertion Sort List
<p>
  구현 : 반복문(while)
  n개의 노드가 들어있는 list * n개의 노드가 들어있는 result list
  시간복잡도 : O(n²)
</p>

결과값을 저장할 result변수를 노드와 노드 사이에 값을 넣을수있도록 생성
```
  let result = new ListNode(null,new ListNode(head.val,null));
  ex)(4->2->1->3)
  (result_point)
  null -> 4
```

새로운 노드(tmp)를 생성해주고 result_point라는 변수를 만들어서 result 리스트의 헤더를 초기화함
실제 링크드 리스트의 이동은 result_point가 하기때문에 result 리스트의 헤더 위치는 잃지 
```
  let tmp = new ListNode(head.val,null);
  let result_point = result; 
  
  예시(4->2->1->3)
   tmp: 2 -> null
   result_point: null -> 4 
```

반복문을 통해서 값을 비교하고 result_point로 위치를 이동하면서 정렬시킴
```
  while(result_point !== null){
    if(result_point.next === null){
        result_point.next = tmp;
        break;
    }
    if(result_point.next.val > tmp.val){
        tmp.next = result_point.next;
        result_point.next = tmp;
        break;
    }
    result_point = result_point.next;
  }
```

```
  예시(4->2->1->3) (cur : 현재 위치)
  (1)
   tmp: 2(cur) -> null
   result_point: null(cur) -> 4
   
   result_point.next가 null이 아니고 result_point.next.val값이 tmp.val값보다 크기 때문에
   두번재 if문 실행됨
   
   tmp: 2(cur) -> 4 (tmp.next = result_point.next)
   result_point: null(cur) -> 2 -> 4 (result_point.next = tmp)
   
   while문 빠져나서 head를 이동시킴
  (2)
    tmp: 1(cur) -> null
    result_point: null(cur) -> 2 -> 4
    
    (1)과 똑같은 로직 수행
    
  (3)
    tmp: 3(cur) -> null
    result_point: null(cur) -> 1 -> 2 -> 4
    
    result_point.next가 null이 아니고 result_point.next.val값이 tmp.val값보다 작기 때문에
    위 족건에 부합할때까지 result_point를 다음 노드로 이동시킴
  
    ...
    
    tmp: 3(cur) -> null
    result_point: 2(cur) -> 4
    
    result_point의 val이 2일때 위 조건에 부합하기때문에 tmp값을 result에 입력
    
    tmp: 3(cur) -> 4 (tmp.next = result_point.next)
    result_point: 2(cur) -> 3 -> 4 (result_point.next = tmp)

    다음 head가 null이여서 while문 빠져나감
    
    result: null -> 1 -> 2 -> 3 -> 4
    이런식으로 데이터가 들어가있고
    
    result.next를 return하면 앞에 null을 제외한 원하는 데이터를 얻을 수 있음
```

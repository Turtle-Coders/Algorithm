
# Insertion Sort List

- 기존 Insertion sort와 알고리즘이 다르지 않지만 값이 Singly linked list로 되어있어 이점을 유의해야한다.
시간복잡도는 노드가 역순(Worst case)일 경우 O(n2), 노드가 정렬되어있다면(Best case), O(n)이다.

결과 노드가 필요할 것이며, 그 노드의 Head를 기억하고 있어야 한다.

```
        result = ListNode()
        curr = head
```

리스트를 순회하는 과정에서 결과리스트가 될 ListNode를 previous node에 넣어주고(1번째 Value) next에 그 다음 값을 설정해준다.
정렬할 리스트노드를 순회하며 크기가 작으면 prev의 다음, next이전에 순회중인 노드의 값을 넣어줄 것.
```
    prev_n = result
    next_n = prev_n.next      
```

이전과 현재 노드의 값을 다음 값과 먼저 비교 후, 다음 값이 더 크다면 break,
다음값이 더 작다면( 현재값이 다음보다 크다면) prev_n, next_n를 다음 노드로 진행시켜준다.
```
    while next_n:
                if curr.val < next_n.val:
                    break;
                prev_n = next_n
                next_n = next_n.next

```

위 로직에서 옮겨온 노드 위치 이전, 다음 노드 사이에 현재 노드를 넣는다.
```
            next_iter = curr.next
            curr.next = next_n
            prev_n.next = curr         
            curr = next_iter
            
```

LeetCode에서 제공한 ListNode() 클래스의 val 초기값이 0으로 세팅되어있어 결과노드를 처음에 인스턴스생성하는 과정에서
맨앞에 0 값이 들어간 노드가 생성되어 result.next를 반환해주었다.
```
        return result.next
```

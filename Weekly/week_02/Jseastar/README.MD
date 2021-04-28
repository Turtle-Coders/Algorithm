
# Merge Two Lists

- 지난주 풀었던 Insertion Sort 이후 풀게 되니 더 수월했다.
- 이번에 주어진 클래스 Singly linked node. for, while Loop를 돌리는것도 가능하겠다고 생각했지만 Recurcive로 푸는게 더 간결할 것 같다고 판단했다.

- 반드시 주어진 노드의 처음부터 끝까지 보기 때문에 시간복잡도는 O(n)

탈출조건 - l1 혹은 l2가 None(노드의 끝)일때 result.next에 l2 혹은 l1를 붙이고 끝낸다.
```
  if not l1: return l2
  if not l2: return l1
```

l1 과  l2를 비교해 작은 node value를 result에 붙이는 방법으로 간단히 풀렸다!
```

      if l1.val <= l2.val:
          result.val = l1.val
          result.next = self.mergeTwoLists(l1.next, l2)
      elif l1.val > l2.val:
          result.val = l2.val
          result.next = self.mergeTwoLists(l1, l2.next)
      return result
```

# [Binary Tree Tilt](../../week_2/Keepbang)
(전 주차에 풀이있음)

# [Valid Anagram](../../week_2/Keepbang)
(전 주차에 풀이있음)

# [Climbing Stairs](./ClimbingStairs.js)
값을 대입해보면서 쭉 나열해보면 한가지 규칙이있다는것을 볼 수 있다
```
n = 1 : 1
n = 2 : 2
n = 3 : 3
n = 4 : fn(n-1(3)) + fn(n-2(2)) : 5
n = 4 : fn(n-1(5)) + fn(n-2(3)) : 8
....
```
__fn(n) = fn(n-1) + fn(n-2)__

이걸 대입해서 풀면된다.
시간복잡도는 O(n-2) = O(n)이된다.(최초 1,2는 배열에 넣었기 때문에)

# [Range Sum of BST](./RangeSumOfBST.js)
간단한 이진 트리 탐색 문제이다.

어느방법을 써도 괜찮지만 중위순회로 하기로 했다.

__중위순회 : 왼쪽노드 -> root -> 오른쪽노드__

중위 순회를 할때 low와 high값을 val와 비교하면서 왼쪽노드에서 나온 결과와 오른쪽노드에서 나온 결과의 합을 반환해준다.

시간복잡도는 모든 노드를 순회함으로 O(n)이다.

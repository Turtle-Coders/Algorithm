# [Binary Tree Tilt](../../week_2/Keepbang)
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
___fn(n) = fn(n-1) + fn(n-2)___

이걸 대입해서 풀면된다.
시간복잡도는 O(n-2) = O(n)이된다.(최초 1,2는 배열에 넣었기 때문에)


# [First Bad Version]
```
Binary search를 활용하여 bad version을 찾음

검색할때 값을 반으로 나눠서 검색하기 때문에 시간복잡도는 O(logn)

반으로 나눈값을 x라 했을때 x가 bad version이면 최소한의 bad version은 x이거나 x아래에있고
x가 bad version이 아니면 bad version은 x보다 큰값임
```

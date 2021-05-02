### [[Jump game - Medium](./JumpGame.java)]
```
움직일수 있는 최대 인덱스값을 사용하여 마지막 인덱스까지(또는 넘어서까지)갈 수 있는 배열을 찾음

Input: nums = [2,3,1,1,4]
배열의 마지막 인덱스 : 4
각 인덱스의 움직일수 있는 최대 인덱스 값을 구하면

index       :   0   1   2   3   4
value(값)    :   2   3   1   1   4
jump Index  :   2   4   3   4   
(마지막 인덱스는 계산하지 않음)
jump index는 현재 값에 index를 더한 

여기서 보면 최대 인덱스는 4인걸 볼 수 있음
최대인덱스 값 >= 마지막 인덱스 이기때문에 true

똑같은 방법으로 Example 2번을 보면
Input: nums = [3,2,1,0,4]
배열의 마지막 인덱스 : 4

index       :   0   1   2   3   4
value(값)    :   3   2   1   0   4
jump Index  :   3   3   3   3

최대인덱스 값이 마지막 인덱스보다 작기때문에 false
```

### [[Happy number - Eazy](HappyNumber.js)]
```
숫자를 자릿수로 나눠 배열에 넣고 그 배열로 제곱의 합을 구하는 함수를 사용
위 함수로 구한 값과 배열 A에 들어있는 값과 비교하여 같은 값이 있으면 false를 반환하고
값은 값이 없으면 배열 A에 저장후 재귀함수를 실행

위 함수로 구한 값이 1이면 true를 반환

```


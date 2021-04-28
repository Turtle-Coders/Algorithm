
# 문제풀이

### Word Pattern
<p>
  구현 : 반복문
  시간복잡도 : O(n)
  - pattern과 s을 배열로 만드는 반복문 1개씩 사용
</p>

인수로 받은 pattern과 s를 배열로 만들어서 숫자로 변경
```
  ...
  for(let x of strArr){
    if(isNaN(x)){
        strArr = strArr.map((val)=>(val === x? counter: val))
        counter++;    
    }
  }
  
  ...
  
  for(let x of ptArr){
    if(isNaN(x)){
        ptArr = ptArr.map((val)=>(val === x? counter: val))
        counter++;    
    }
  }
  
  ...
```

숫자로 만든 배열을 문자열로 변환하여 비교

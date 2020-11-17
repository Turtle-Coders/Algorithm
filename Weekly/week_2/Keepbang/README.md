# [Binary Tree Tilt](./BinaryTreeTilt.js)

# [Merge Two Sorted Lists](./MergeTwoSortedLists.js)

**'정렬된'** 두 단방향 링크드 리스트를 merge sort시키는 문제!!의외로 간단하다.

먼저 정렬시킨 리스트를 저장할 변수(result) 생성

리스트1과 리스트2가 null이 될때까지 값을 비교하여 result에 리스트 객체 생성

만약 두 리스트중 하나가 null이되면 두 리스트중 null이 아닌 리스트를 뒤에 붙여주면 끝난다.

시간복잡도는 두리스트중 하나가 null이 될때까지 반복문을 돌리니까 O(n)


# [Valid Anagram](./ValidAnagram.js)
아나그램(Anagram)이란 글자의 철자를 바꿔 다른 의미를 만드는것인데 여기에서는 그냥 철자가 바뀐것? 단어/문장의 스펠링이 순서만 바뀐것을 찾는거같다.

1. 먼저 두 문자열이 같은 철자를 가지고 있다면 글자의 길이가 같아야하니 글자의 갯수가 같은지 비교를 먼저 한다.
```
if(s.length !== t.length){
    return false;
}
```

2. 문자열의 중간값을 빼내기 쉽게 배열로 만들어준다(자바스크립트 기준)
```
t = t.split("");
```

3. 반복문을 돌려서 해당 문자가 배열에 존재하는지 확인한 후 있으면 배열에서 값을 빼준다
```
for(let i = 0;i<s.length;i++){

    if(t.indexOf(s[i]) > -1){
        t.splice(t.indexOf(s[i]),1);
    }
}
```

4. 반복문이 끝나고 배열에 값이 남아있으면 두 문자열이 다른것이므로 false를 반환해주고 배열에 남아있는 값이 없으면 true를 반환해준다.
```
if(t.length > 0){
    return false;
}else{
    return true;
}
```

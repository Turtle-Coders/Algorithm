# [Group anagram](./GroupAnagrams.java)
```
같은 정렬인데 타입이 뭐냐에 따라 속도차이가 많이 남
조인이 시간을 많이 잡아먹는건가...

// 내 소스
String[] sepWord = word.split("");
Arrays.sort(sepWord);
String wordSort = String.join("", sepWord);

// 다른 사람 소스
char[] sepWord = word.toCharArray();
Arrays.sort(sepWord);
String wordSort = String.valueOf(sepWord);


```

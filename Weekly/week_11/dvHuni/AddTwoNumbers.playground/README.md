
##
# Add Two Numbers

## 시간 복잡도 분석
  - O(n) : Recursive이므로 최악의 경우 입력갯수인 n 만큼 반복.
    
## 문제 풀이
![IMG_2276](https://user-images.githubusercontent.com/39300449/116773497-7b905080-aa90-11eb-8ede-87dc5305c811.jpg)
  - output이 ListNode로 나와야 하기 때문에 ListNode initalizer를 직접 따라가다보면 Recursive(initalizer에서 addTwoNumbers를 다시 호출)적인 부분을 발견 할 수 있다.
  - 놓쳤던 부분이 두가지 있는데, **올림수**, **다음재귀**이다.
  1. 올림수
      - 이 부분은 carry라는 변수를 통해 올림수를 저장하고, 덧셈 연산에 반영한다. 또한 마지막 노드에서 carry가 존재한다면, **carry만으로 노드를 만들어야한다(중요!)**
  2. 다음재귀
      - addTwoNumbers를 호출 할 때, 다음 노드를 호출해야하는데, 자기 자신을 호출하는 코드를 짰었다. **(addTwoNumbers(l1, l2))**
      - 재귀를 짠다면 당연 생각해야되는 다음 조건을 재귀를 짜본 경험이 많이 없어 체크하지 못했다. 이번을 계기로 다음 Recursive 문제에서는 조건을 놓치지않았으면 하는 바램..

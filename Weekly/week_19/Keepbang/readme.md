# Remove Nth Node From End of List

두 포인터를 만들어 앞서나간 포인터와 뒤에 따라오는 포인터의 간격이 n이라는 것을 사용하여 문제를 풀었습니다.

front란 포인터는 n만큼 먼저 앞으로 이동시킵니다.

이때 front가 null이라면 맨 앞쪽의 데이터를 삭제해야하는 것이기 때문에 head = head.next로 위치를 바꾸고 return합니다.

front가 null이 아니라면 back과 front를 같이 움직이는데 이때는 front.next가 null이 될때까지 움직입니다.

front.next가 null이라면 back.next가 삭제되어야할 대상이기 때문에 back.next를 back.next.next로 연결을 바꿔줌으로 삭제 할 수 있습니다.

![image](https://user-images.githubusercontent.com/38740455/127485271-1a7581ec-7636-4dda-84cb-740ac818cb21.png)


# Add Binary

처음에는 십진수로 바꿔서 계산한다음 이진수로 변경하는 방법으로 문제를 풀었는데 값의 길이가 길어지면서 이건 정수형으로는 못푸는 문제라 생각했습니다.

그래서 문자열로 나눠서 뒤에서부터 차례대로 계산했습니다.

계산 방법은 아래와 같이했습니다.

1. 두 이진수 문자열 중 길이가 긴것과 짧은것으로 나눠준다
2. 두 문자열을 뒤에서부터 charAt으로 한글자씩 계산한다.
3. carry가 있으면 계산결과에 1을 더해주고 carry를 false로 바꿔준다(올림수를 사용했기 때문에 바꿔줌).
4. carry까지 더한 계산 결과가 2이상이라면 carry를 true로 바꿔줘서 다음 계산때 올림수가 추가되도록 한다.
5. 계산결과를 String type인 answer앞에 이어 붙인다.
6. 2 ~ 5까지의 순서를 반복하다가 길이가 짧은 문자열의 모든 문자를 사용했을경우 길이가 긴 문자열의 남은 문자를 3 ~ 5 순서로 index값이 0이 될때까지 반복한다.
7. index값이 0이 되었다면 carry의 값을 확인하고 carry 가 true이면 answer앞에 1을 추가하여 반환하고 false이면 answer를 반환한다.

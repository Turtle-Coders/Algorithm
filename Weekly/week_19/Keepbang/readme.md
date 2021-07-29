# Remove Nth Node From End of List

두 포인터를 만들어 앞서나간 포인터와 뒤에 따라오는 포인터의 간격이 n이라는 것을 사용하여 문제를 풀었습니다.

front란 포인터는 n만큼 먼저 앞으로 이동시킵니다.

이때 front가 null이라면 맨 앞쪽의 데이터를 삭제해야하는 것이기 때문에 head = head.next로 위치를 바꾸고 return합니다.

front가 null이 아니라면 back과 front를 같이 움직이는데 이때는 front.next가 null이 될때까지 움직입니다.

front.next가 null이라면 back.next가 삭제되어야할 대상이기 때문에 back.next를 back.next.next로 연결을 바꿔줌으로 삭제 할 수 있습니다.

![image](https://user-images.githubusercontent.com/38740455/127485271-1a7581ec-7636-4dda-84cb-740ac818cb21.png)

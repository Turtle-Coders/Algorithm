/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmpL1 = l1;
        ListNode tmpL2 = l2;

        int overNum = 0;
        while(true){
            int sumNum = tmpL1.val + tmpL2.val + overNum;
            tmpL1.val = sumNum % 10;

            //합한 값이 10이상일경우 올림값 추가
            if(sumNum > 9){
                overNum = Integer.valueOf(sumNum/10);
            }else{
                overNum = 0;
            }


            //리스트 두개모두 null일 경우 break
            if(tmpL1.next == null && tmpL2.next == null){
                if(overNum != 0){//overNum이 있을 경우 리스트1에 추
                    tmpL1.next = new ListNode(overNum);
                }
                break;
            }else if(tmpL1.next == null && tmpL2.next != null){
                //리스트1이 null이면 1에 빈리스트 추가
                tmpL1.next = new ListNode(0);
            }else if(tmpL1.next != null && tmpL2.next == null){가
                //리스트2가 null이면 2에 빈리스트 추가
                tmpL2.next = new ListNode(0);
            }

            tmpL1 = tmpL1.next;
            tmpL2 = tmpL2.next;

        }
        return l1;
    }
}
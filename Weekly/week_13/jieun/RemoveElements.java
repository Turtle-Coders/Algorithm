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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dump = head;
        
        if (head == null) {
            return null;
        }
        
        while (dump.next != null) {
            if (dump.next.val == val) {
                dump.next = dump.next.next;
            } else {
                dump = dump.next;
            }
        }
        
        if (head.val == val) {
            head = head.next;
        }
        
        return head;
    }
}

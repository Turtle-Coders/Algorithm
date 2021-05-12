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
        ListNode output = head;
        
        ListNode curr = head;
        
        if(curr == null){
            return output;
        }
        
        if(head.next == null){
            if(curr.val == val)
                output = output.next;
            
            return output;
        }
        
        ListNode prev = head;
        
        curr = curr.next;
        
        while(curr != null){
            
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            
            curr = curr.next;
            
        }
        
        if(output.val == val){
            return output.next;
        }
        
        
        return output;
        
    }
        
        
}

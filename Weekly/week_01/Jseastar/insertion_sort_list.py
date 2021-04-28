# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertionSortList(self, head: ListNode) -> ListNode:
        result = ListNode()
        curr = head
        
        while curr:
            prev_n = result
            next_n = prev_n.next
        
            while next_n:
                if curr.val < next_n.val:
                    break;
                prev_n = next_n
                next_n = next_n.next
                
            next_iter = curr.next
            
            curr.next = next_n
            prev_n.next = curr
            
            curr = next_iter
            
        return result.next

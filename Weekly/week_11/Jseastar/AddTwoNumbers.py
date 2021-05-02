# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        def addTwoLNs(l1: ListNode, l2: ListNode, i:int) -> ListNode:
            carry = 0
            l3 = ListNode()
            if l1 or l2 or i:
                l = l1.val if l1 else 0
                r = l2.val if l2 else 0
                
                value_l3 = l + r + i
                l3.val = value_l3
                
                if value_l3 >= 10 :
                    carry = 1
                    l3.val -= 10

                l1 = l1.next if l1 else None
                l2 = l2.next if l2 else None
                if l1 or l2 or carry:
                    l3.next = addTwoLNs(l1, l2, carry)
                return l3
            else:
                return None
        return addTwoLNs(l1,l2,0)
        

import Foundation

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init() { self.val = 0; self.next = nil; }
    public init(_ val: Int) { self.val = val; self.next = nil; }
    public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
}

class Solution {
    func reverseList(_ head: ListNode?) -> ListNode? {
        guard head != nil else { return head }
        
        var headNode = head
        var new: ListNode?
        
        while headNode != nil {
            let next = headNode?.next
            headNode?.next = new
            new = headNode
            headNode = next
        }
        
        return new
    }
}


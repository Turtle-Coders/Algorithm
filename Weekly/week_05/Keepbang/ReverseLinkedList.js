/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let tmp = head
    let tail = null
    while(tmp !== null){
        let nextNode = tmp.next
        tmp.next = tail
        tail = tmp
        tmp = nextNode
    }

    return tail
};

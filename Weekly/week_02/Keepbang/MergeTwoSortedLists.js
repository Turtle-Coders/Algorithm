/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    
    let result = new ListNode();
    let point = result;
    
    while(l1 !== null && l2 !== null){
        
        if(l1.val >= l2.val){
            point.next = new ListNode(l2.val);
            l2 = l2.next;
        }else{
            point.next = new ListNode(l1.val);
            l1 = l1.next
        }
        
        point = point.next;
        
    }
    
    if(l1 === null){
        point.next = l2;
    }

    if(l2 === null){
        point.next = l1;
    }
    
    return result.next;
    
};

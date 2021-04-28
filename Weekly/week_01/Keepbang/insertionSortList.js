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
var insertionSortList = function(head) {
    if(head === null)
        return head;
    
    let result = new ListNode(null,new ListNode(head.val,null));
    
    head = head.next;
    
    while(head !== null){
        let tmp = new ListNode(head.val,null);
        let result_point = result;    
        
        while(result_point !== null){
            if(result_point.next === null){
                result_point.next = tmp;
                break;
            }
            if(result_point.next.val > tmp.val){
                tmp.next = result_point.next;
                result_point.next = tmp;
                break;
            }
            result_point = result_point.next;
        }
        
        
        
        head = head.next;
    }
    
    return result.next;
    
    
};

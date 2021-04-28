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
var oddEvenList = function(head) {

    if(head == null){
        return null;
    }

    let oddList = new ListNode(head.val,null);
    let oddHead = oddList;
    head = head.next;

    let evenList = null;
    let evenHead = evenList;
    if(head != null){
        evenList = new ListNode(head.val,null);
        evenHead = evenList;
        head = head.next;
    }

    let curState = -1;  //-1 : odd, 1 : even


    while(head != null){
        let tmp = new ListNode(head.val,null)
        if(curState == -1){
            oddList.next = tmp;
            oddList = oddList.next;
        }else{
            evenList.next = tmp;
            evenList = evenList.next;
        }
        curState *= -1;
        head = head.next;
    }

    oddList.next = evenHead;

    return oddHead;

};
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
var addTwoNumbers = function(l1, l2) {
    var tmpL1 = l1;
    var tmpL2 = l2;
    var overNum = 0;
    while(1){
        var sumNum = tmpL1.val + tmpL2.val + overNum;
        tmpL1.val = sumNum%10;
        if(sumNum > 9){
            overNum = parseInt(sumNum/10);
        }else{
            overNum = 0;
        }

        if(tmpL1.next === null && tmpL2.next === null){
            if(overNum !== 0){
                tmpL1.next = new ListNode(overNum);
            }
            break;
        }else if(tmpL1.next === null && tmpL2.next !== null){
            tmpL1.next = new ListNode();
        }else if(tmpL1.next !== null && tmpL2.next === null){
            tmpL2.next = new ListNode();
        }

        tmpL1 = tmpL1.next;
        tmpL2 = tmpL2.next;


    }

    return l1;


};


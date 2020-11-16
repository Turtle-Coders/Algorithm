/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTilt = function(root) {
    if(root === null) return 0;
    let leftVal = sumVal(root.left);
    let rightVal = sumVal(root.right);
    return Math.abs(leftVal - rightVal) + findTilt(root.left) + findTilt(root.right);
    
    
}


const sumVal = (node) => {
    if(node === null){
        return 0;
    }
    
    let left = sumVal(node.left);
    let right = sumVal(node.right);

    return left + right + node.val;
}



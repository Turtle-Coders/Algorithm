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
var maxDepth = function(root) {
    
    //let level = 1
    
    let search = function(node,level){
        if(node === null){
            return level
        }

        let llv = search(node.left,level+1)
        let rlv = search(node.right,level+1)
        
        
        return Math.max(llv,rlv)
        
    }
    
    return search(root,0)
    
};

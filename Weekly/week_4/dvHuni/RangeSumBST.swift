
import Foundation

class Solution {
    var answer = 0
    
    func rangeSumBST(_ root: TreeNode?, _ l: Int, _ r: Int) -> Int {
        answer = 0
        DFS(root, l, r)
        return answer
    }
    
    func DFS(_ node: TreeNode?, _ l: Int, _ r: Int) {
        if let node = node {
            if l <= node.val && node.val <= r {
                answer += node.val
            }
            
            DFS(node.left, l, r)
            
            DFS(node.right, l, r)
            
        } else {
            return
        }
    }
}

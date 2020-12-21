
import Foundation

class Solution {
    func climbStairs(_ n: Int) -> Int {
        if n < 4 {
            return n
        }
        
        var first = 1
        var second = 1
        var total = 0
        
        for _ in 1..<n {
            total = first + second
            first = second
            second = total
        }
        
        return total
    }
}


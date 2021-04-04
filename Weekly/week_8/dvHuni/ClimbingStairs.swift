
import Foundation

class Solution {
    func climbStairs(_ n: Int) -> Int {
        var a = 1
        var b = 2
        var c = 0
        
        if n == 1 {
            return 1
        }
        
        if n == 2 {
            return 2
        }
        
        for _ in 3...n {
            c = a + b
            a = b
            b = c
        }
        
        return c
    }
}

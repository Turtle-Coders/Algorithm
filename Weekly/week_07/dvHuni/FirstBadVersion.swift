
import Foundation

/**
 * The knows API is defined in the parent class VersionControl.
 *     func isBadVersion(_ version: Int) -> Bool{}
 */

class Solution : VersionControl {
    func firstBadVersion(_ n: Int) -> Int {
        var left = 0, right = n, lastBad = n
        
        while left + 1 < right {
            var center = (left + right) / 2
            if isBadVersion(center) {
                lastBad = center
                right = center
            } else {
                left = center
            }
        }
        
         return lastBad
    }
}



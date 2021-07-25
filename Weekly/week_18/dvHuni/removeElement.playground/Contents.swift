
import Foundation

class Solution {
    /// 주어진 숫자 배열 nums에서 주어진 숫자 val을 제거한 배열과, 해당 배열의 원소 갯수를 Return하기
    /// - Parameters:
    ///   - nums: (inout) 숫자배열
    ///   - val: 제거해야할 숫자
    /// - Returns: 제거 된 배열의 원소 갯수
    func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
        /// filter를 통해 배열의 원소 거르기
        nums = nums.filter({ $0 != val })
        
        /// 배열의 원소 갯수 return
        return nums.count
    }
}

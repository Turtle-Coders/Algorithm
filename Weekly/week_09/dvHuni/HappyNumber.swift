
import Foundation

class Solution {
    func isHappy(_ n: Int) -> Bool {
        var isHappyNumber: Bool = false
        var digitArray = makeDigitArray(n)
        var container: [Int] = []
        
        while calcualte(digitArray) != 1 {
            let result = calcualte(digitArray)
            if container.contains(result) {
                isHappyNumber = false
                return isHappyNumber
            }
            container.append(result)
            
            digitArray = makeDigitArray(result)
        }
        
        isHappyNumber = true
        
        return isHappyNumber
    }
    
    func makeDigitArray(_ n: Int) -> [Int] {
        return "\(n)".compactMap({ NSString(string: String($0)).integerValue })
    }
    
    func calcualte(_ digits: [Int]) -> Int {
        var sum = 0
        
        digits.forEach {
            sum += $0 * $0
        }
        
        return sum
    }
}

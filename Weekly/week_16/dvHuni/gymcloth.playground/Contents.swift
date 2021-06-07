import UIKit
import Foundation

func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    var studentNumbers: [Int?] = {
        var tt: [Int] = []
        for number in 1...n {
            tt.append(number)
        }
        return tt
    }()
    
    let sortedLost = lost.sorted()
    sortedLost.forEach {
        studentNumbers[$0 - 1] = nil
    }
    
    let sortedReverse =  reserve.sorted()
    sortedReverse.forEach {
        if studentNumbers[$0 - 1] != nil {
            if $0 != n {
                if studentNumbers[$0] == nil {
                    studentNumbers[$0] = $0
                }
            }
        } else {
            studentNumbers[$0 - 1] = $0
        }
    }
    
    return studentNumbers.filter({ $0 != nil }).count
}

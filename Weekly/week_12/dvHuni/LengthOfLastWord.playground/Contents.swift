import UIKit
import Foundation

func lengthOfLastWord(_ s: String) -> Int {
    guard
        let lastComponents = s.trimmingCharacters(in: .whitespaces).components(separatedBy: " ").last
    else {
        return 0
    }
    
    
    return lastComponents.count
}

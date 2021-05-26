import UIKit
import Foundation

class Solution {
    func maxProfit(_ prices: [Int]) -> Int {
        var minPrice: Int = prices.first ?? 0
        var difference: Int = 0
        
        prices.forEach { price in
            minPrice = min(minPrice, price)
            difference = max(difference, price - minPrice)
        }
        
        return difference
    }
}

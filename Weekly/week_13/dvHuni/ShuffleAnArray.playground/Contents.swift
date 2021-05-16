import UIKit
import Foundation

class Solution {

    var origin: [Int] = []
    
    init(_ nums: [Int]) {
        self.origin = nums
    }
    
    /** Resets the array to its original configuration and return it. */
    func reset() -> [Int] {
        return origin
    }
    
    /** Returns a random shuffling of the array. */
    func shuffle() -> [Int] {
        /* return origin.shuffled() */
        var indexArray: [Int] = {
            var temp: [Int] = []
            var index = 0
            origin.forEach { _ in
                temp.append(index)
                index += 1
            }
            
            return temp
        }()
        
        let shuffledIndexArray: [Int] = {
            var temp: [Int] = []
            for _ in 0...indexArray.count - 1 {
                let index = Int.random(in: 0..<indexArray.count)
                temp.append(indexArray[index])
                indexArray.remove(at: index)
            }
            
            return temp
        }()
        
        let shuffled: [Int] = {
            var temp: [Int] = []
           for index in shuffledIndexArray {
               temp.append(origin[index])
           }
            
            return temp
        }()
        
        return shuffled
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * let obj = Solution(nums)
 * let ret_1: [Int] = obj.reset()
 * let ret_2: [Int] = obj.shuffle()
 */

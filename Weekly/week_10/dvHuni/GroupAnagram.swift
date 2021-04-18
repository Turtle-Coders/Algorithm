import Foundation

class Solution {
    func groupAnagrams(_ strs: [String]) -> [[String]] {
        let sortedStrs: [String] = strs.map({ $0.sorted() }).map({ String($0)})
        let sortedTupleStrs: [(String, String)] = {
            sortedStrs.enumerated().compactMap({ ($1, strs[$0]) }).sorted(by: { $0.0 > $1.0 })
        }()
        return groupping(sortedTupleStrs).sorted(by: { $0.count < $1.count })
    }
    
    func groupping(_ strs: [(String, String)]) -> [[String]] {
        var result: [[String]] = []
        var group: [String] = []
        
        var current: String?
        
        for str in strs.enumerated() {
            if current == nil {
                current = str.element.0
            }
            
            if current == str.element.0 {
                group.append(str.element.1)
            } else {
                result.append(group)
                
                group = []
                current = str.element.0
                group.append(str.element.1)
            }
        }
        
        result.append(group)
        
        return result
    }
}

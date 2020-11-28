//
//  Word-Pattern.swift
//
//  Created by dvHuni on 2020/11/28.
//  Copyright © 2020 dvHuni. All rights reserved.
//

import Foundation

class Solution {
    func wordPattern(_ pattern: String, _ s: String) -> Bool {
        let patterns = pattern.map { String($0) }
        let values = s.components(separatedBy: " ")
        
        // #1
        if patterns.count != values.count {
            return false
        }
        
        var dictionary: [String: String] = [:]
        
        
        for (index, key) in patterns.enumerated() {
            // #2
            if dictionary.keys.contains(key) {
                if dictionary[key] != values[index] {
                    return false
                }
            } else {
                // #3
                if dictionary.values.contains(values[index]) {
                    return false
                } else {
                    dictionary[key] = values[index]
                }
            }
        }
        
        return true
    }
}


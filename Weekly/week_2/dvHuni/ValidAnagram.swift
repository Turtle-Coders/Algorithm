//
//  ValidAnagram.swift.swift
//
//  Created by dvHuni on 2020/12/07.
//  Copyright © 2020 dvHuni. All rights reserved.
//

import Foundation

class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        if s.count != t.count || s.sorted() != t.sorted() {
            return false
        }
        
        return true
    }
}


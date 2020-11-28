# Word Pattern

## 시간 복잡도 분석

  map, for문 만 존재하므로 O(n)
  
## 문제 풀이
  Dictionary를 이용하여 Key, Value로 비교
  
    import Foundation

    class Solution {
      func wordPattern(_ pattern: String, _ s: String) -> Bool {
          let patterns = pattern.map { String($0) }
          let values = s.components(separatedBy: " ")

          if patterns.count != values.count {
              return false
          }

          var dictionary: [String: String] = [:]

          for (index, key) in patterns.enumerated() {
              if dictionary.keys.contains(key) {
                  if dictionary[key] != values[index] {
                      return false
                  }
              } else {
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

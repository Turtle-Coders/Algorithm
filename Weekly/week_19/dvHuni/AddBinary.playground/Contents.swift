
import Foundation

class Solution {
    func addBinary(_ a: String, _ b: String) -> String {
        let arrayA = Array(a)
        let arrayB = Array(b)
        var i = arrayA.count - 1
        var j = arrayB.count - 1

        var result = ""
        var carry = 0

        while i >= 0 || j >= 0 || carry > 0 {
            /// 이전 자리수 연산에서 carry 값이 존재할수도 있으므로 가져오기
            var sum = carry

            /// 자리수 합 구하기
            if i >= 0 {
                sum += Int(String(arrayA[i]))!
                i -= 1
            }

            if j >= 0 {
                sum += Int(String(arrayB[j]))!
                j -= 1
            }

            /// carry 변경
            carry = sum / 2

            /// 현재 결과에서 이번 연산값을 앞에 붙여주기
            result = "\(sum % 2)" + result
        }

        return result
    }
}


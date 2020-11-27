/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    
    
    let res = []
    res.push(0)
    res.push(1)
    res.push(2)
    for(let i = 3;i<=n;i++){
        res[i] = res[i-1] + res[i-2]
    }
    
    return res[n]
    
};

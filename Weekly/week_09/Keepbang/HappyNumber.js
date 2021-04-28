/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    return isHappyFn(n,[]);
};

var isHappyFn = function(n,arr){
    if(n == 1){
        return true;
    }

    let sum = sumFn(n);
    for(let i = 0;i<arr.length;i++){
        if(arr[i] == sum){
            return false;
        }
    }

    arr.push(sum);

    return isHappyFn(sum,arr);
}

var sumFn = function(n){
    return n.toString().split("").reduce((sum,n)=> sum += Math.pow(n,2),0);
}
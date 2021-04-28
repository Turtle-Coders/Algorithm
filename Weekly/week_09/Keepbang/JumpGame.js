/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let max = 0;
    let len = nums.length - 1;
    for (let i = 0; i < len; i++) {
        if(nums[i] == 0 && max <= i){
            return false;
        }
        max = Math.max(i + nums[i],max);
        if(max >= len) return true;
    }
    
    if(max >= len) return true;
    
    return false;
};

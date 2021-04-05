class Solution {
    public boolean canJump(int[] nums) {
        
        int max = 0;
        int len = nums.length -1;
        for(int i = 0;i<len;i++){
            if(nums[i] == 0 && max <= i){
                return false;
            }
            max = Math.max(i + nums[i],max);
            if(max >= len) return true;
        }
        
        if(max >= len) return true;
        
        return false;
    }
}

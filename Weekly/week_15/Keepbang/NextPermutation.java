class Solution {
    public void nextPermutation(int[] nums) {
        int min = -1;
        int max = nums.length-1;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                min = i;
            }
        }
        
        if(min < 0){
            reverse(nums, min, (nums.length + 1)/2);
            return;
        }
        
        for(int j = nums.length - 1 ; j > min ; j-- ){
            if(nums[min] < nums[j]){
                swap(nums, min, j);
                break;
            }
        }
        
        reverse(nums, min, (nums.length + min + 1)/2);
        
        

        
        
    }
    
    void reverse(int[] nums, int first, int middle){
        for(int i = first+1; i < middle ; i++){
            swap(nums, i, nums.length - (i - first));
        }
    }
    
    void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

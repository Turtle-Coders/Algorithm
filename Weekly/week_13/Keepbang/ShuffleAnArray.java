class Solution {
    
    int[] nums;
    

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        
        ArrayList<Integer> checkDuplication = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int len = this.nums.length;


        while(checkDuplication.size() != len){
            int idx = random.nextInt(len);

            if(!checkDuplication.contains(idx)){
                result.add(this.nums[idx]);
                checkDuplication.add(idx);
            }

        }
        
        return result.stream().mapToInt(i -> i).toArray();
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

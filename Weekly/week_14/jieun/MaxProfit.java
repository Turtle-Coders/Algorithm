class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        
        for (int i = 0; i < prices.length-1; i++) {
            int curr = prices[i];   
            for (int j = i+1; j < prices.length; j++) {
                int next = prices[j]; 
                
                if (next-curr > 0) {
                    if (max < next-curr) {
                        max = next-curr;
                    }
                }
            }
        }
        
        return max;
    }
}

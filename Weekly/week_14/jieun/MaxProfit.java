// Time Limit Exceeded이 나옴

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
-----------------------------------------------------------
// 더 나은 소스
    
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        
        return maxprofit;
    }
}

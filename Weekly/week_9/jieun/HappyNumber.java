class Solution {
    public boolean isHappy(int n) {
        while (n > 1) {
			int total = 0;
			String[] happyNum = String.valueOf(n).split("");
			
			for (String StringNum : happyNum) {
				if (!"".equals(StringNum)) {
					int num = Integer.parseInt(StringNum);
					total += num*num;
				}
			}
			n = total; 
            
            if (Integer.MAX_VALUE < total) {
                break;
            }
		}
        
        if (n != 1){
        	return false;
        } else {
        	return true;
        }
    }
}

------------------------------------------------------------------------------

// 인터넷에서 알고리즘 찾아봄

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> cache = new HashSet(); //Set을 통해서 중복된 값들은 자동으로 제거
        while(!cache.contains(n)){
            cache.add(n);
            n = getSum(n);
            
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    
    public int getSum(int num){
        int sum = 0;
        while(num > 0){
            sum += (num % 10) * (num % 10); // 1의 자릿수
            num /= 10;                      // 10의 자릿수
        }
        return sum;
    }
}

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

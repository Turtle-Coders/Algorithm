class Solution {
    
    
    public String addBinary(String a, String b) {
        
        
        String longStr = "";
        String shortStr = "";
        
        if(a.length() > b.length()){
            longStr = a;
            shortStr = b;
        }else{
            longStr = b;
            shortStr = a;
        }
        
        
        int lIdx = longStr.length()-1;
        int sIdx = shortStr.length()-1;

        
        String answer = "";
        
        boolean carry = false;
        
        while(lIdx >= 0){
            
            int sum = 0;
            
            if(sIdx < 0){
                sum = Character.getNumericValue(longStr.charAt(lIdx--));
            }else{
                sum = Character.getNumericValue(longStr.charAt(lIdx--)) + Character.getNumericValue(shortStr.charAt(sIdx--));    
            }
            
            if(carry){
                sum += 1;
                carry = false;
            }
            
            if(sum > 1){
                carry = true;
                sum = sum - 2;
            }
            
            answer = sum + answer;
        }
        
        if(carry){
            answer = 1 + answer;
        }

        
        return answer;
        
        
    }
}

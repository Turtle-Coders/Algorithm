class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Object> map = new HashMap<>();
        
        String[] array_word = pattern.split(""); 
        String[] sList = s.split(" ");
        
        if (pattern.length() == sList.length){
            for (int i = 0; i < sList.length; i++){
                if (map.containsKey(array_word[i])){
                	if (!map.get(array_word[i]).equals(sList[i])){
                		return false;
                	}
                } else {
                	if (map.containsValue(sList[i])){
                		return false;
                	} else {
                		map.put(array_word[i], sList[i]);
                	}
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

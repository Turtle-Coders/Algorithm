class Solution {
    public boolean isAnagram(String s, String t) {
        String[] oriWord = s.split("");
        String[] compareWord = t.split("");
        
        if (oriWord.length == compareWord.length){
        	
        	Arrays.sort(oriWord);
        	Arrays.sort(compareWord);

        	return Arrays.equals(oriWord, compareWord);
        	
        } else {
            return false;
        }
    }
}

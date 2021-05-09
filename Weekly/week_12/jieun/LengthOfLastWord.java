class Solution {
    public int lengthOfLastWord(String s) {
        
        if (s.equals("") || s.equals(" ")) {
            return 0;
        }
        
        String[] word = s.split(" ");
        int len = word.length;

        if (len == 0) {
          return 0;
        }
        
        return word[len-1].length();
    }
}

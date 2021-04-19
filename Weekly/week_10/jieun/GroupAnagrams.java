class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>>  result  = new ArrayList<>();
        
        if (strs.length > 0) {
            Map<String, Object> listMap = new HashMap<>();
            
            for (String word : strs) {
                // 내 소스
                // String[] sepWord = word.split("");
                // Arrays.sort(sepWord);
                // String wordSort = String.join("", sepWord);
                
                // 다른 사람 소스
                char[] sepWord = word.toCharArray();
                Arrays.sort(sepWord);
                String wordSort = String.valueOf(sepWord);

                if (listMap.get(wordSort) == null) {
                    List<String> wordList = new ArrayList<>();
                    wordList.add(word);
                    listMap.put(wordSort, wordList);
                } else {
                    List<String> wordList = (List<String>) listMap.get(wordSort);
                    wordList.add(word);
                }
            }

            // for (String key : listMap.keySet()) {
            //     result.add((List<String>) listMap.get(key));
            // }
            
            return new ArrayList(listMap.values());
        } 
        
        return result;
    }
}

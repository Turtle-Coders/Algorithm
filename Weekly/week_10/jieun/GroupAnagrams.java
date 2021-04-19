class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>>  result  = new ArrayList<>();
        
        if (strs.length > 0) {
            Map<String, Object> listMap = new HashMap<>();
            
            for (String word : strs) {
                String[] sepWord = word.split("");
                Arrays.sort(sepWord);
                String wordSort = String.join("", sepWord);

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

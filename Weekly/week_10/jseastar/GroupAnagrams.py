class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = dict()
        for i in strs:
            s = ''.join(sorted(list(i)))
            if s in d: 
                d[s].extend([i])
            else :
                d[s] = [i]
                
        return d.values()
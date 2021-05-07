class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.split()[-1]) if s.split() else 0
        
        # return len(s.split()[0] if s.split() else s.split()
        
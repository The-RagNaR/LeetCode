# https://leetcode.com/problems/regular-expression-matching/

# TODO: Not Solved yet
import re

class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        try:
            p = "^"+p+"$"
            pattern = re.compile(p)
            if re.match(pattern, s):
                return True
            return False
        except Exception as e:
            return False
        
        
a = Solution()
print(a.isMatch("abc", "a***abc"))
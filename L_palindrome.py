class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        rev=""
        for i in range(len(s)-1, -1, -1):
            rev += s[i]
        if rev == s:
            return True
        else:
            return False
            


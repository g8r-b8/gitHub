class Solution:
    def lengthOfLastWord(self, s: str) -> int:


        x=s.split()
        length=len(x)
        lastE=length-1
        if(length>=1): ans=len(x[lastE])
        else: ans=0


        return ans


"""
Given a string s consists of upper/lower-case alphabets and
empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of
non-space characters only.

Example:

Input: "Hello World"
Output: 5
"""

# Last updated: 9/11/2026, 11:32:41 AM
1class Solution:
2    def countOdds(self, low: int, high: int) -> int:
3        return (high+1)//2 - low//2
4
5
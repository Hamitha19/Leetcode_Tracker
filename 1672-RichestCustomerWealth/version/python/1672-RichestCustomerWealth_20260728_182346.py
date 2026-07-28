# Last updated: 7/28/2026, 6:23:46 PM
1class Solution:
2    def maximumWealth(self, accounts: List[List[int]]) -> int:
3        max=0
4        for customer in accounts:
5            wealth=sum(customer)
6            if wealth>max:
7                max=wealth
8        return max
9        
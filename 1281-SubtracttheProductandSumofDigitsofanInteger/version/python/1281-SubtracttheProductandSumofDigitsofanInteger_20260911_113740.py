# Last updated: 9/11/2026, 11:37:40 AM
1class Solution:
2    def totalMoney(self, n: int) -> int:
3        tot=0
4        mon=1
5        for i in range(n):
6            day=i%7
7            tot+=day+mon
8            if day==6:
9                mon+=1
10        return tot
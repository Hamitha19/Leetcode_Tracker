# Last updated: 9/11/2026, 11:29:25 AM
1class Solution:
2    def numberOfSteps(self, num: int) -> int:
3        count=0
4        while(num>0):
5            if num%2==0:
6               num=num//2
7               count+=1
8            else:
9               num=num-1
10               count+=1
11        return count;
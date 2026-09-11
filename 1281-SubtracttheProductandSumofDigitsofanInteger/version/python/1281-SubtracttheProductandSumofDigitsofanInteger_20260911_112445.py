# Last updated: 9/11/2026, 11:24:45 AM
1class Solution:
2    def subtractProductAndSum(self, n: int) -> int:
3        m=n
4        prod=1
5        while(m>0):
6            temp=m%10
7            prod*=temp
8            m//=10
9        m=n
10        sum=0
11        while(m>0):
12            temp=m%10
13            sum+=temp
14            m//=10
15        return prod-sum
16        
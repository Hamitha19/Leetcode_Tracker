// Last updated: 10/6/2026, 11:13:16 AM
1class Solution {
2    public int countEven(int num) {
3        int count=0;
4        for(int i=1;i<=num;i++){
5            int n=i;
6            int d=0;
7            while(n>0){
8                int temp=n%10;
9                d+=temp;
10                n/=10;
11                }
12                if(d%2==0){
13                    count++;
14                }
15            
16        }
17        return count;
18    }
19}
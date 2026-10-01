// Last updated: 10/1/2026, 11:26:43 AM
1class Solution {
2    public int minimumSum(int num) {
3        int d1=num%10;
4        num/=10;
5        int d2=num%10;
6        num/=10;
7        int d3=num%10;
8        num/=10;
9        int d4=num%10;
10        int []digits={d1,d2,d3,d4};
11        Arrays.sort(digits);
12        int n1=digits[0]*10+digits[2];
13        int n2=digits[1]*10+digits[3];
14        return n1+n2;
15    }
16}
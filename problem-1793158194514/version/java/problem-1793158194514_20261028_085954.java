// Last updated: 10/28/2026, 8:59:54 AM
1class Solution {
2    public double calculateTax(int[][] brackets, int income) {
3        double tax=0;
4        int prev=0;
5        for(int i=0;i<brackets.length;i++){
6            int upper=brackets[i][0];
7            int percent=brackets[i][1];
8            int amount=Math.min(income,upper)-prev;
9            if(amount<=0){
10                break;
11            }
12            tax+=(double)amount*percent /100;
13            prev=upper;
14        }
15        return tax;
16    }
17}
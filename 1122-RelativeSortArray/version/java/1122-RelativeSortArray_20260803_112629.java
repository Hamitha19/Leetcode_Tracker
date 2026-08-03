// Last updated: 8/3/2026, 11:26:29 AM
1class Solution {
2    public int numEquivDominoPairs(int[][] dominoes) {
3        int ans=0;
4        int []count=new int[100];
5        for(int[] domino : dominoes){
6            int a=Math.min(domino[0],domino[1]);
7            int b=Math.max(domino[0],domino[1]);
8            int key=a*10+b;
9            ans+=count[key];
10            count[key]++;
11        }
12        return ans;
13    }
14}
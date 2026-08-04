// Last updated: 8/4/2026, 12:45:46 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int ones = 0;
4        int flips = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == '1') {
7                ones++;
8            } else {
9                flips = Math.min(flips + 1, ones);
10            }
11        }
12        return flips;
13    }
14}
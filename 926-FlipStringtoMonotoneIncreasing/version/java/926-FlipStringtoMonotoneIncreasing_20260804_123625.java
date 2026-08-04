// Last updated: 8/4/2026, 12:36:25 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int ones = 0;
4        int flips = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '1') {
8                ones++;
9            } else {
10                flips = Math.min(flips + 1, ones);
11            }
12        }
13
14        return flips;
15    }
16}
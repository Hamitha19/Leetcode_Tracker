// Last updated: 8/4/2026, 12:09:09 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = s.length();
4        int[] match = new int[n];
5
6        // Initialize with -1
7        for (int i = 0; i < n; i++) {
8            match[i] = -1;
9        }
10
11        // Store which replacement starts at each index
12        for (int i = 0; i < indices.length; i++) {
13            int idx = indices[i];
14
15            if (s.startsWith(sources[i], idx)) {
16                match[idx] = i;
17            }
18        }
19
20        StringBuilder ans = new StringBuilder();
21
22        for (int i = 0; i < n; ) {
23
24            if (match[i] != -1) {
25                int k = match[i];
26
27                ans.append(targets[k]);
28                i += sources[k].length();
29            } else {
30                ans.append(s.charAt(i));
31                i++;
32            }
33        }
34
35        return ans.toString();
36    }
37}
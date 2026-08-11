// Last updated: 8/11/2026, 11:59:02 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public String tree2str(TreeNode root) {
18        StringBuilder sb = new StringBuilder();
19        solve(root, sb);
20        return sb.toString();
21    }
22    public void solve(TreeNode root, StringBuilder sb) {
23        if (root == null) {
24            return;
25        }
26        sb.append(root.val);
27        if (root.left != null) {
28            sb.append("(");
29            solve(root.left, sb);
30            sb.append(")");
31        }
32        if (root.right != null) {
33            if (root.left == null) {
34                sb.append("()");
35            }
36            sb.append("(");
37            solve(root.right, sb);
38            sb.append(")");
39        }
40    }
41}
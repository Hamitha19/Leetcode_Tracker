// Last updated: 9/15/2026, 11:48:41 AM
1class Solution {
2    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
3        List<Integer> ans=new ArrayList<>();
4        for(int i=0;i<=100;i++){
5            int count=0;
6            for(int j=0;j<nums1.length;j++){
7                if(nums1[j]==i){
8                    count++;
9                    break;
10                }
11            }
12            for(int j=0;j<nums2.length;j++){
13                if(nums2[j]==i){
14                    count++;
15                    break;
16                }
17            }
18            for(int j=0;j<nums3.length;j++){
19                if(nums3[j]==i){
20                    count++;
21                    break;
22                }
23            }
24            if(count>=2){
25                ans.add(i);
26            }
27            
28        }
29        return ans;
30    }
31}
// Last updated: 10/13/2026, 12:12:01 PM
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        List<Integer> list1=new ArrayList<>();
4        List<Integer> list2=new ArrayList<>();
5        for(int i=0;i<nums1.length;i++){
6            boolean found=false;
7            for(int j=0;j<nums2.length;j++){
8                if(nums1[i]==nums2[j]){
9                    found=true;
10                    break;
11                }
12            }
13            if(!found && !list1.contains(nums1[i])){
14                list1.add(nums1[i]);
15           }
16        }
17        for(int i=0;i<nums2.length;i++){
18            boolean found=false;
19            for(int j=0;j<nums1.length;j++){
20                if(nums2[i]==nums1[j]){
21                    found=true;
22                    break;
23                }
24            }
25            if(!found && !list2.contains(nums2[i])){
26                list2.add(nums2[i]);
27           }
28        }
29        List<List<Integer>> list=new ArrayList<>();
30        list.add(list1);
31        list.add(list2);
32        return list;
33    }
34}
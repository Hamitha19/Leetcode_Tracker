// Last updated: 7/14/2026, 2:07:23 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> values=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!values.contains(nums2[j])){
                    values.add(nums2[j]);
                    }
                }
            }
        }
        int []ans=new int[values.size()];
        for(int i=0;i<values.size();i++){
            ans[i]=values.get(i);
        }
        return ans;
    }
}
// Last updated: 7/14/2026, 2:07:25 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }
        List<Integer> values=new ArrayList<>(map.keySet());
        values.sort((a,b) -> map.get(b) - map.get(a));
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=values.get(i);
        }
        return ans;
    }
}